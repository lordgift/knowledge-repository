package app.test;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.jboss.resteasy.specimpl.MultivaluedMapImpl;

import app.bean.Person;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;


public class CallingExample {

	public static void main(String[] args) {
			
		try {
			Client client = Client.create();
 
			String url = "http://localhost:8080/RestStarter/rest/Connector/getHelloText";
			WebResource webResource = client.resource(url);
			
//			System.out.println(getHelloTextBySendFormUrlEnCoded(webResource));	
//			System.out.println();
//			System.out.println(getHelloTextByJson(webResource));
			
			System.out.println(getHelloTextByBean(webResource));

		} catch (Exception e) {
			e.printStackTrace();
		}


	}

	private static String getHelloTextByJson(WebResource webResource) throws JSONException {
		String output;
		ClientResponse response;
		JSONObject json = new JSONObject();		
		json.put("firstname", "Gift");
		json.put("lastname", "Yoh");
//			json.put("firstname", "Gift<<"); /* json will put single if duplicate key */
//			json.put("lastname", "Yoh<<");
		System.out.println(json);

		response = webResource.type(MediaType.APPLICATION_JSON).post(ClientResponse.class, json);
		output = response.getEntity(String.class);
		
		return output;
	}

	private static String getHelloTextBySendFormUrlEnCoded(WebResource webResource) {
		String output;
		ClientResponse response;
		MultivaluedMap<String, String> multivaluedMap = new MultivaluedMapImpl();
		multivaluedMap.add("firstname", "Gift");			
		multivaluedMap.add("lastname", "Yoh");
//			multivaluedMap.add("firstname", "Gift<<"); /* multivaluedMap will check duplicate key and do it to array*/
//			multivaluedMap.add("lastname", "Yoh<<");
		System.out.println(multivaluedMap);

		response = webResource.type(MediaType.APPLICATION_FORM_URLENCODED).post(ClientResponse.class, multivaluedMap);
		output = response.getEntity(String.class);

		return output;
	}
	private static String getHelloTextByBean(WebResource webResource) throws JSONException {
		String output;
		ClientResponse response;
		
		
		Person person = new Person();		
		person.setFirstname("dddd");
		person.setLastname("xxxx");
		
		
		response = webResource.type(MediaType.APPLICATION_JSON).post(ClientResponse.class, person);
		output = response.getEntity(String.class);

		return output;
	}
}
/* object , array in object*/