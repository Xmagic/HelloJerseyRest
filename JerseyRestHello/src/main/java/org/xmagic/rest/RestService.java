package org.xmagic.rest;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/restService")
public class RestService {
	
	//http://localhost:8080/JerseyRestHello/rest/restService/getInfo
	@GET
	@Path("/getInfo")
	@Produces(MediaType.TEXT_PLAIN)
	public String getWebServiceInfo() {
		return "Hello, RESTful web service!";
	}
	
	//url: http://localhost:8080/JerseyRestHello/rest/restService/user?value=24
	//output: Hello from user:24
	
	//url: http://localhost:8080/JerseyRestHello/rest/restService/123456
	//output: Hello from 123456:Nothing to say
	@GET
	@Path("/{parameter}")
	public Response respondMessage(@PathParam("parameter") String parameter, 
			@DefaultValue("Nothing to say") @QueryParam("value") String value) {
		String out = "Hello from " + parameter + ":" + value;
		return Response.status(200).entity(out).build();
	}
}
