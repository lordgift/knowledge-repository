package application.test;

import java.util.Map;

import javax.ws.rs.core.MultivaluedMap;

import org.jboss.resteasy.specimpl.MultivaluedMapImpl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class TestRestClient {
	
	private static final String IP_CONNECTION = "http://localhost:8080"; 

	ObjectMapper mapper = new ObjectMapper();

	public static void main(String[] args) {
		//////////////////////////////////////////////////////////////
		
		TestRestClient client = new TestRestClient();
		client.testGetMessage();
		client.testQueryFwUser();

	}

	public void testGetMessage() {
		try {

			Client client = Client.create();

			// String url =
			String url = IP_CONNECTION + "/TestWebService/rest/service/getMessage";

			// post
			WebResource webResource = client.resource(url);

			//parameter
			MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
			queryParams.add("message", "sommai");
//			queryParams.add("password", "sommaixx");

			ClientResponse response = webResource.type("application/x-www-form-urlencoded").post(ClientResponse.class, queryParams);

			String output = response.getEntity(String.class);
			System.out.println("output = " + output);

//			Map map = mapper.readValue(output, Map.class);
//			System.out.println("result = " + map.get("result"));
//			System.out.println("username = " + map.get("username"));

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public void testQueryFwUser() {
		try {

			Client client = Client.create();

			// String url =
			String url = IP_CONNECTION + "/TestWebService/rest/service/queryFwUser";

			// post
			WebResource webResource = client.resource(url);

			//parameter
			MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
			queryParams.add("userId", "02xxxxAL00");

			ClientResponse response = webResource.type("application/x-www-form-urlencoded").post(ClientResponse.class, queryParams);

			String output = response.getEntity(String.class);
			System.out.println("output = " + output);

			Map map = mapper.readValue(output, Map.class);
			
			if(map.get("result").equals("Y")) {
				System.out.println("username = " + map.get("username"));
			} else {
				System.out.println("message = " + map.get("message"));
			}
			
			

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
