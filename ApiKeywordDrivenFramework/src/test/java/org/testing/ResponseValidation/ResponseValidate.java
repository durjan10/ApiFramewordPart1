package org.testing.ResponseValidation;

import org.testing.Utilities.ParsingJsonUsingJsonPath;

import com.jayway.restassured.response.Response;

public class ResponseValidate 
{
	public static void statusCodeValidate(int expectedStatusCode, Response response)
	{
		if(expectedStatusCode == response.getStatusCode())
		{
			System.out.println("Response code is Correct");
		}
		else
		{
			System.out.println("Response code is Incorrect");
		}
		
	}
	
	public static void dataValidate(String expectedData, Response response, String jsonPath)
	{
		if(expectedData.equals(ParsingJsonUsingJsonPath.parseJson(response, jsonPath)))
		{
			System.out.println("Data is matching");
		}
		else
		{
			System.out.println("Data is not matching");
		}

	}
 
 
}
