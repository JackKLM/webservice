package com.webservice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.core.Response.Status;

//import org.json.JSONException;
//import org.json.JSONObject;

//import jdk.nashorn.internal.parser.JSONParser;


@Path("/ProcessData")
public class CallService {

/*	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getHello(){
		String str = "Hello";
		JSONObject jsonObj;
		String response = "";
		//JSONParser parser = new JSONParser();
		//JSONObject json = (JSONObject) parser.parse(response);
		try {
			jsonObj = new JSONObject(str);
			response = jsonObj.toString();
		} catch (JSONException e) {
			response = "Error, did not convert to JSON";
			e.printStackTrace();
		}
		return response;
	}*/
	
/*	public native void callDll();
	
	static {
		System.setProperty("java.library.path", "C:/Users/X089725/workspace/Web Service");
		System.loadLibrary("CforJava");
	}*/
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public User getHello(){
//	public List<User> getHello(){
//		List<User> str = new ArrayList<User>();
//		str.add(new User(1, "Jack","badminton"));
//		str.add(new User(2, "Tracy","nothing"));
		//String response = "TESTTT";
		User str = new User(1,"Jack","badminton");
		return str;
	}
	
	@GET
	@Path("/{filename}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getData(@PathParam("filename") String filename) {
//		CallService us = new CallService();
//		us.callDll();
//		String[] args = {"1","1"};
		cppCaller c = new cppCaller();
		c.call();
		String response = filename;//"";
/*	     try{
	    	String sub = "echo '" + filename + "'";
	        ProcessBuilder builder = new ProcessBuilder("cmd", sub);
	        Process process = builder.start();
	        BufferedReader in = new BufferedReader((new InputStreamReader(process.getInputStream())));
//	        String line;
	        
	        char[] test = new char[200];//8191
	        
	        int charsRead = -1;
	        do {
	        	charsRead = in.read(test);
	        	response += new String(test);
	        	System.out.println(response);
	        } while (charsRead == test.length);
	    }catch(Exception e){
	    	response = "ERROR";
	    	e.printStackTrace();
	    }*/

		return response;
//	     return "test";
	}
/*	@GET
	@Path("/{text}")
	@Produces(MediaType.APPLICATION_JSON)
	public ResponseBuilder getText(@PathParam("text") String text){
		return Response.status(Status.OK)
				.entity(text);
	}*/
	
/*   UserDao userDao = new UserDao();

   @GET
   @Path("/users")
   @Produces(MediaType.APPLICATION_XML)
//   @Produces(MediaType.APPLICATION_JSON)
   public List<User> getUsers(){
      return userDao.getAllUsers();
   }	*/
}