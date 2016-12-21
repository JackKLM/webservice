// CforJava.cpp : Defines the exported functions for the DLL application.
//

#include <jni.h>
#include "com_webservice_cppCaller.h"
#include "stdio.h"
#include "stdafx.h"
#include <iostream>
#include <fstream>

using namespace std;
JNIEXPORT void JNICALL Java_com_webservice_cppCaller_call(JNIEnv *env, jobject obj) {
	printf("Called Hello!!!\n");
	ofstream myfile;
	myfile.open("test.txt");
	myfile << "Writing this to a file.\n";
	myfile.close();
	return;
}



