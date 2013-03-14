package app.test;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;

import org.codehaus.jettison.json.JSONArray;
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
 
			String url = "http://localhost:8089/RestStarter/rest/Connector/getHelloText";
			WebResource webResource = client.resource(url);
			
			System.out.println(getHelloTextBySendFormUrlEnCoded(webResource));	
//			System.out.println();
//			System.out.println(getHelloTextByJson(webResource));
			
			System.out.println(getHelloTextByBean(webResource));
//			System.out.println(getHelloTextByArray(webResource));

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
	private static String getHelloTextByArray(WebResource webResource) throws JSONException {
		String output;
		ClientResponse response;
		List<Person> perList = new ArrayList<Person>();
//		JSONArray objArr = null;
		
		
		Person person1 = new Person();	
		Person person2 = new Person();
		person1.setFirstname("dddd");
		person1.setLastname("xxxx");
		person2.setFirstname("2222");
		person2.setLastname("33333");
		
		perList.add(person1);
		perList.add(person2);
		
		JSONArray objArr = new JSONArray(perList);
		
//		objArr.put(person1);
//		objArr.put(person2);
		
		response = webResource.type(MediaType.APPLICATION_JSON).post(ClientResponse.class, objArr);
		output = response.getEntity(String.class);

		return output;
	}
}
/* object , array in object*/