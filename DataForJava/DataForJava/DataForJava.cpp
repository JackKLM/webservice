// DataForJava.cpp : Defines the exported functions for the DLL application.
//

#include <jni.h>
#include "com_webservice_CallFilesServer.h"
#include "stdio.h"
#include "stdafx.h"
#include <iostream>
#include <fstream>

using namespace std;
JNIEXPORT jstring JNICALL Java_com_webservice_CallFilesServer_getData(JNIEnv *env, jobject obj, jstring str)
{
	//convert the java string to a const char
	const char *original = (*env).GetStringUTFChars(str, 0);
	//convert to a string and add " in the C" to the string
	string cstr = std::string(original) + " in the C";
	//convert back to a const char
	const char *newChar = cstr.c_str();
	//print the new const char
	printf("%s", newChar);
	
	//writes the new const char to a file (will end up in the eclipse folder)
	ofstream myfile;
	myfile.open("cppOutput.txt");
	myfile << newChar;
	myfile.close();

	//convert the new const char back to a java string and return it
	return (*env).NewStringUTF(newChar);
}
