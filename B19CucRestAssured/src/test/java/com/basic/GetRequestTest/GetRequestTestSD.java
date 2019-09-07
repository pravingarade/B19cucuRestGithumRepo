package com.basic.GetRequestTest;

import java.util.List;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;


public class GetRequestTestSD {
	
	Response res;
	
	@Given("^user start the rest asured test$")
	public void user_start_the_rest_asured_test() throws Throwable {
	    
		System.out.println("starting Get REST service");
	}

	@When("^user hit get request$")
	public void user_hit_get_request() throws Throwable {
		res =RestAssured.given().relaxedHTTPSValidation().get("https://ergast.com/api/f1/2017/circuits.json");
	   String completeResponse =res.asString();
	   System.out.println("========"+completeResponse);
	}

	@Then("^user checks the \"([^\"]*)\" count$")
	public void user_checks_the_count(String arg1) throws Throwable {
		
		String acuallimit= res.body().jsonPath().getString("MRData.limit");
		Assert.assertTrue(acuallimit.equals(arg1));
	   
	}
	@Then("^user checks at path \"([^\"]*)\" the \"([^\"]*)\" count$")
	public void user_checks_at_path_the_count(String arg1, String arg2) throws Throwable {
		String acuallimit= res.body().jsonPath().getString(arg1);
		Assert.assertTrue(acuallimit.equals(arg2));
	    
		/*List<Object> CirList= res.getBody().jsonPath().getList("MRData.CircuitTable.Circuits");
		int size=CirList.size();
		String fele="";
		for(Object ele : CirList)
		{
			if(ele.toString().equals(arg2))
			{
				fele=ele.toString();
				break;
			}
			Assert.assertTrue(fele.equals(arg2)); */
		}		
}
