package app.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

@Path("Connector")
public class Connector {
	
	@POST
	@Path("getText")
	@Consumes(MediaType.APPLICATION_JSON)
	public String getText(String textMessage) throws JSONException{
		JSONObject json = new JSONObject(textMessage);
		String text = (String) json.get("text");
		return text;
	}

}
