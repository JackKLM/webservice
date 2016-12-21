#pragma once

#ifdef CforJava_EXPORTS  
#define CforJava_API __declspec(dllexport)   
#else  
#define CforJava_API __declspec(dllimport)   
#endif  

namespace CforJava
{
	// This class is exported from the CforJava.dll  
	class Functions
	{
	public:
		// Returns a + b  
		static CforJava_API double Add(double a, double b);

		// Returns a * b  
		static CforJava_API double Multiply(double a, double b);

		// Returns a + (a * b)  
		static CforJava_API double AddMultiply(double a, double b);
	};
}