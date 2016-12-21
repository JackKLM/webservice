package com.webservice;

public class cppCaller {

	public native void call();
	
	static {
		
		//System.setProperty("java.library.path", "C:/Users/X089725/workspace/Web Service");
		System.out.println("in cppCaller static");
		System.loadLibrary("CforJava");
	}
	public static void main(String[] args) {
		System.out.println("In cppCaller main");
		cppCaller c = new cppCaller();
		c.call();
		//System.out.println(args[0] + args[1]);
	}

}
