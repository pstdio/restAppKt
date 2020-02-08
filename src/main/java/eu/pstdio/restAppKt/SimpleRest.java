package eu.pstdio.restAppKt;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("test")
public class SimpleRest {
	
	@GET
	public Response test() {
		return Response.ok("test passed").build();
	}
}
