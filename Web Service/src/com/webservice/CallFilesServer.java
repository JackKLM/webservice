package com.webservice;

/**
 * This class contains the importation of the .dll file and the declaration of the native method.
 * 
 * @author user X089725
 *
 */
public class CallFilesServer {
	//declare native method
	public native String getData(String str);
	
	//static block to load the library
	static {
//		System.out.println("in static block");
		System.loadLibrary("DataforJava");
	}
	
	public static void main(String[] args) {
//		System.out.println("in main");

	}
}
