package application.service;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Path("service")
public class ServiceConnection implements Constants {
	
	@POST
	@Path("getMessage")
	public String getMessage(@FormParam("message") String message) {
		return message;
	}
	
	@POST
	@Path("queryFwUser")
	public String QueryFwUser(@FormParam("userId") String userId) throws JsonGenerationException, JsonMappingException, IOException {
		try {
			return DaoUtils.queryFwUser(userId);
		} catch(Exception e) {
			e.printStackTrace();
		}
		ObjectMapper mapper = new ObjectMapper();
		Map<String, String> map = new HashMap<String, String>();
		map.put("result", "N");
		map.put("message", "เกิดความผิดพลาดในการเรียก service");
		
		Writer strWriter = new StringWriter();
		mapper.writeValue(strWriter, map);
		return strWriter.toString();
		
	}

}
