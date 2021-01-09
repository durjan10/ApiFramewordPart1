package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.ResponseValidation.ResponseValidate;
import org.testing.TestSteps.HTTPMethods;
import org.testing.Utilities.LoadProperties;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

public class TC03_Get_WithEndpoints_TestCase 
{
	@Test(enabled=false)
	public void testCase3() throws IOException 
	{
	    Properties p= LoadProperties.properties("../ApiKeywordDrivenFramework/URI.properties");
	    HTTPMethods httpGetEndpointsObj = new HTTPMethods(p);
	    Response response = httpGetEndpointsObj.getRequestwithEndpoints("QA_URI1", TC01_Post_TestCase.idValue);
	    ResponseValidate.statusCodeValidate(200, response);

	}

}
