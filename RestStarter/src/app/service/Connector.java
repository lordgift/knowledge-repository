package app.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import org.codehaus.jettison.json.JSONObject;

import app.bean.Person;

@Path("Connector")
public class Connector {

//	@POST
//	@Path("getHelloText")
//	@Consumes(MediaType.APPLICATION_JSON)
//	public String getHelloText(String jsonString) {
//		try {
//			 JSONObject json = new JSONObject(jsonString);
//			 String firstname = (String) json.get("firstname");
//			 String lastname = (String) json.get("lastname");
//			return "Hello, " + firstname + lastname;
//
//		} catch (Exception e) {
//			e.printStackTrace();
//			return "Service Error";
//		}
//	}

	@POST
	@Path("getHelloText")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public String getHelloText(@FormParam("firstname")String firstname, @FormParam("lastname")String lastname) {
		try {
			return "Hello, " + firstname + lastname;

		} catch (Exception e) {
			e.printStackTrace();
			return "Service Error";
		}
	}	
	
	@POST
	@Path("getHelloText")
	@Consumes(MediaType.APPLICATION_JSON)
	public String getHelloText(Person person) {
		try {
			
			return person.getFirstname()+person.getLastname();

		} catch (Exception e) {
			e.printStackTrace();
			return "Service Error";
		}
	}	
	
}
