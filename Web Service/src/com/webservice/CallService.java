package com.webservice;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * This class creates the web service which can be called with the specified paths.
 * 
 * @author user X089725
 *
 */
@Path("/ProcessData")
public class CallService {	
	
	//path that generates a HTTP get request. This request returns that it needs input after the /
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getHello(){
		return "You need to give some more input after the / (i.e. ../ProcessData/...)";
	}
	
	/*	path that generates a HTTP get request. This request adds "in the C" to the input by
	 * 	using the CallFilesServer and the native method. So the change to the input is done in C++.
	 *  It returns the input it got as a String
	 */
	@GET
	@Path("/{input}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getData(@PathParam("input") String input) {
		CallFilesServer cfs = new CallFilesServer();
		String response = cfs.getData(input);
		return response;
	}
}
