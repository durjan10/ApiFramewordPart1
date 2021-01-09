package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.json.simple.JSONObject;
import org.testing.ResponseValidation.ResponseValidate;
import org.testing.TestSteps.HTTPMethods;
import org.testing.Utilities.LoadJsonPayload;
import org.testing.Utilities.LoadProperties;
import org.testing.Utilities.ParsingJsonUsingJsonPath;
import org.testing.Utilities.VariableReplacementInJsonPayload;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

public class TC04_Put_TestCase 
{
	@Test(enabled=false)
	public void testCase4() throws IOException 
	{	
        JSONObject data =  new JSONObject();
        data.put("firstname", "John1");
        data.put("lastname", "kim");
        data.put("age", "56");	    
        data.put("id", TC01_Post_TestCase.idValue);
        data.put("designation", "trainee");
	    
		Properties p = LoadProperties.properties("../ApiKeywordDrivenFramework/URI.properties");
	    HTTPMethods httpPutObj = new HTTPMethods(p);
	    Response response = httpPutObj.putRequest(data.toString(), "QA_URI1", TC01_Post_TestCase.idValue);
	    ResponseValidate.statusCodeValidate(200, response);
	    ResponseValidate.dataValidate("John1", response, "firstname");


	}


}
