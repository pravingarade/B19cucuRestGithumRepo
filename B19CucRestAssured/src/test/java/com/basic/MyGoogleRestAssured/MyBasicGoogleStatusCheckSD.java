package com.basic.MyGoogleRestAssured;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;


public class MyBasicGoogleStatusCheckSD {
	
	Response res;
	@Given("^Google url launch$")
	public void Google_url_launch(){
		
		res=RestAssured.given().get("https://www.google.com");
		
		
	}
	
	@Then("^API status code success$")
	public void API_status_code_success(){
		
		
		int statuscode=res.getStatusCode();
		System.out.println("Staus Code"+statuscode);
		Assert.assertTrue(200==statuscode);
		
		
	}
	

}
