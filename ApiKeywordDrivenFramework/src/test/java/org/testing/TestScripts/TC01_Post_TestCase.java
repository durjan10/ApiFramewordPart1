package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.json.JSONObject;
import org.testing.ResponseValidation.ResponseValidate;
import org.testing.TestSteps.HTTPMethods;
import org.testing.Utilities.LoadJsonPayload;
import org.testing.Utilities.LoadProperties;
import org.testing.Utilities.ParsingJsonUsingJsonPath;
import org.testing.Utilities.VariableReplacementInJsonPayload;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

public class TC01_Post_TestCase 
{
	static String idValue;
    
	@Test(enabled=true)
	public void testCase1() throws IOException 
	{	
		//generating random variable(id) using random class
		Random randomvariable = new Random();
		// here replacing id so taking as interger value
		Integer id  = randomvariable.nextInt();
		System.out.println("newl generated variable id value is "+id);
		Properties p = LoadProperties.properties("../ApiKeywordDrivenFramework/URI.properties");
		String body  = LoadJsonPayload.loadPayload("../ApiKeywordDrivenFramework/src/test/java/org/testing/Payloads/simplebody.json");
		body = VariableReplacementInJsonPayload.jsonValueReplacement(body, "id", id.toString());
	    HTTPMethods httpPostObj = new HTTPMethods(p);
	    System.out.println("json payload after variable change is "+body);
	    Response response  = httpPostObj.postRequest(body, "QA_URI1");
	    idValue = ParsingJsonUsingJsonPath.parseJson(response, "id");
	    System.out.println("id values generated in post that will be used in get request is "+idValue);
	    ResponseValidate.statusCodeValidate(201, response);

	    

	}

}
