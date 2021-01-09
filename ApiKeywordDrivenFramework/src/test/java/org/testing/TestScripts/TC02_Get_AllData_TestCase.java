package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.ResponseValidation.ResponseValidate;
import org.testing.TestSteps.HTTPMethods;
import org.testing.Utilities.LoadProperties;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

public class TC02_Get_AllData_TestCase 
{
	@Test(enabled=true)
	public void testCase2() throws IOException 
	{
	    Properties p= LoadProperties.properties("../ApiKeywordDrivenFramework/URI.properties");
	    HTTPMethods httpGetObj = new HTTPMethods(p);
	    Response response = httpGetObj.getRequest("QA_URI1");
	    ResponseValidate.statusCodeValidate(200, response);
	    ResponseValidate.dataValidate("Noida", response, "[2].Addressdetails[0].City");

	}

}
