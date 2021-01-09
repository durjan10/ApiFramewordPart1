package org.testing.TestSteps;

import java.util.Properties;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.RestoreAction;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.*;

public class HTTPMethods
{
	Properties pr;
	
	public HTTPMethods(Properties pr)
	{
		this.pr=pr;
	}
	
	// this is post method request for creating API
	public Response postRequest(String postbody, String UriKey)
	{
		Response response = given()
				            .contentType(ContentType.JSON)
				            .body(postbody)
				            .when()
				            .post(pr.getProperty(UriKey));
		
		System.out.println("status code is "+response.statusCode());
		  
		return response;
				          
	}
	
	// get request without path or query parameter 
	public Response getRequest(String UriKey)
	{
		Response response = given()
				            .contentType(ContentType.JSON)
				            .when()
				            .get(pr.getProperty(UriKey));
		System.out.println("status code is "+response.statusCode());
		System.out.println("Response of get request is "+response.asString());
		
		return response;
				          
	}	
	
	// get request with path parameter/endpoints for above created api data
	public Response getRequestwithEndpoints(String UriKey, String idValue)
	{
		String URI = pr.getProperty(UriKey)+"/"+idValue;
		Response response = given()
				            .contentType(ContentType.JSON)
				            .when()
				            .get(URI);
		System.out.println("status code is "+response.statusCode());
		System.out.println("Response of get request with Endpoints is "+response.asString());		
		return response;
				          
	}
	
	// put request with path parameter/endpoints for changing values in data of api created above
	public Response putRequest(String body ,  String UriKey , String idValue)
	{
		String URI = pr.getProperty(UriKey)+"/"+idValue;
		Response response = given()
				            .contentType(ContentType.JSON)
				            .body(body)
				            .when()
				            .put(URI);
		return response;
				          
	}
	
	// Delete request from newly generated id data from put request
	public Response deleteRequest(String UriKey ,String idValue)
	{
		String URI = pr.getProperty(UriKey)+"/"+idValue;
		Response response = given()
				            .contentType(ContentType.JSON)
				            .when()
				            .put(URI);
		return response;
				          
	}
	
	
	
	
	
}
