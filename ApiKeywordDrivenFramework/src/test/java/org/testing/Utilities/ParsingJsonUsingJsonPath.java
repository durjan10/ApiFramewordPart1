package org.testing.Utilities;

import com.jayway.restassured.response.Response;

public class ParsingJsonUsingJsonPath 
{
	public static String parseJson(Response response, String jsonPath)
	{
		return response.jsonPath().get(jsonPath);
	}

}
