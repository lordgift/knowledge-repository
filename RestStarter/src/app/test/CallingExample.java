package app.test;

import java.io.*;
import java.math.BigDecimal;
import java.net.*;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;

import org.codehaus.jettison.json.*;

import app.bean.Person;

import com.google.gson.Gson;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.core.util.MultivaluedMapImpl;

public class CallingExample {

	public static void main(String[] args) {

		try {
//			Client client = Client.create();
// 
//			String url = "http://localhost:8080/RestStarter/rest/Connector/getHelloText";
//			WebResource webResource = client.resource(url);
//			
//			System.out.println(getHelloTextBySendFormUrlEnCoded(webResource));	
//			System.out.println();
//			System.out.println(getHelloTextByJson(webResource));
			
//			System.out.println(getHelloTextByBean(webResource));
//			System.out.println(getHelloTextByArray(webResource));

//			androidStyleWebservice();


			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void androidStyleWebservice() throws JSONException, IOException {

		URL url = new URL("http://157.179.132.233:8080/RestStarter/rest/Connector/getJobToMobile");
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		con.setDoOutput(true);
		con.setDoInput(true);
		con.setInstanceFollowRedirects(false);
		con.setRequestMethod("POST");
		
		con.setRequestProperty("Content-Type",MediaType.APPLICATION_JSON);//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
		con.setRequestProperty("charset", "utf-8");
		// connection.setRequestProperty("Content-Length", "" +
		// Integer.toString(urlParameters.getBytes().length));
		con.setUseCaches(false);

		DataOutputStream wr = new DataOutputStream(con.getOutputStream());
//		
//		
//		
//		Pair<String, String> pair = new  Pair<String, String>("paramKey1", "paramVal1");
//		Pair<String, String> pair2 = new  Pair<String, String>("paramKey2", "paramVal2");
//		Pair<String, String> pair3 = new  Pair<String, String>("paramKey3", "paramVal3");
//		wr.writeBytes(new Gson().toJson(pair));
//		wr.writeBytes(new Gson().toJson(pair2));
//		wr.writeBytes(new Gson().toJson(pair3));
////		
//		Person p = new Person();
//		p.setFirstname("Lord");
//		p.setLastname("Gift");
//		wr.writeBytes(new Gson().toJson(p));
		
		wr.writeBytes("{\"firstname\":\"LORD\",\"lastname\":\"Gift\"}");

		wr.flush();
		wr.close();

		BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(), "utf-8"));
		String line = null;

		StringBuilder sb = new StringBuilder();

		while ((line = br.readLine()) != null) {
			sb.append(line + "\n");
		}
		br.close();

		 System.out.println(""+sb.toString());

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
/* object , array in object */