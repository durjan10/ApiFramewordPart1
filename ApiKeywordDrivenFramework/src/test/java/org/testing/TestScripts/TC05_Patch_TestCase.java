package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.ResponseValidation.ResponseValidate;
import org.testing.TestSteps.HTTPMethods;
import org.testing.Utilities.LoadProperties;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

public class TC05_Patch_TestCase 
{
	@Test(enabled=false)
	public void testCase5() throws IOException 
	{
	    Properties p= LoadProperties.properties("../ApiKeywordDrivenFramework/URI.properties");
	    HTTPMethods DeleteObj = new HTTPMethods(p);
	    Response response = DeleteObj.deleteRequest("QA_URI1", TC01_Post_TestCase.idValue);
	    System.out.println("status code validation after delete request");
	    ResponseValidate.statusCodeValidate(200, response);

	}


}
