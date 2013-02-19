package app.test;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;

import org.codehaus.jettison.json.JSONObject;
import org.jboss.resteasy.specimpl.MultivaluedMapImpl;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;


public class CallingExample {

	public static void main(String[] args) {
			
		testGetMessage();

	}

	public static void testGetMessage() {
		try {

			Client client = Client.create();
 
			String url = "http://localhost:8080/RestStarter/rest/Connector/getText";
			WebResource webResource = client.resource(url);

			//parameter
			JSONObject queryParams = new JSONObject();
			MultivaluedMap<String, String> queryParams2 = new MultivaluedMapImpl();
			queryParams2.add("text", "testhtext");
			System.out.println(queryParams2);
			
			queryParams.put("text", "testhtext");
			System.out.println(queryParams);

			ClientResponse response = webResource.type(MediaType.APPLICATION_JSON).post(ClientResponse.class, queryParams);

			String output = response.getEntity(String.class);
			System.out.println("output = " + output);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
