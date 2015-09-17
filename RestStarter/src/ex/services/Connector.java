package ex.services;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/Connector")
public class Connector {

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/test")
	public String test() {
		return "success";
	}
}