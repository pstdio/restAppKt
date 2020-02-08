package eu.pstdio.restAppKt;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("testKt")
class SimpleRestKT {

	@GET
	public fun getTest() : Response = Response.ok("Test Kt passed").build()

}