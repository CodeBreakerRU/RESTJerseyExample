package com.test;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/RESTService")
public class CtoFService {
	
	@GET
	@Path("/convertCtoF")
	@Produces("application/xml")
	
	public String convertCtoF() {
		
		Double fahrenheit;
		Double celsius = 36.8;
		fahrenheit = ((celsius * 9)/5) + 32;
		
		String result = "@Produces(\"application/xml\") Output: \n\nC to F converter Output : \n\n" + fahrenheit;
		return "<ctofservice>" + "<celsius>" + celsius + "</celsius>" + "<ctofoutput>" + result + "</ctofoutput>" + "</ctofservice>";
	}
 
}
