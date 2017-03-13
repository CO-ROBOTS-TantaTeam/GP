package db.json.mavem;

import javax.websocket.server.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/ctoFService")
public class CtoFService {
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String convertCtoF() {
 
		Double fahrenheit;
		Double celsius = 36.8;
		fahrenheit = ((celsius * 9) / 5) + 32;
 
		String result = "@Produces(MediaType.APPLICATION_JSON) Output: \n\nC to F Converter Output: \n\n" + fahrenheit;
		return "<ctofservice>" + "<celsius>" + celsius + "</celsius>" + "<ctofoutput>" + result + "</ctofoutput>" + "</ctofservice>";
	}
 
//	@Path("{c}")
//	@GET
//	@Produces(MediaType.APPLICATION_JSON)
//	public String convertCtoFfromInput(@PathParam("c") Double c) {
//		Double fahrenheit;
//		Double celsius = c;
//		fahrenheit = ((celsius * 9) / 5) + 32;
// 
//		String result = "@Produces(MediaType.APPLICATION_JSON) Output: \n\nC to F Converter Output: \n\n" + fahrenheit;
//		return "<ctofservice>" + "<celsius>" + celsius + "</celsius>" + "<ctofoutput>" + result + "</ctofoutput>" + "</ctofservice>";
//	}

}
