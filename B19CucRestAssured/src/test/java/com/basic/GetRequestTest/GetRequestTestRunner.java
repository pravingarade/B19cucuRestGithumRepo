package com.basic.GetRequestTest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"src/test/resources/com/basic/GetRequestDataDrivenFF.feature",""},
		glue={"com/basic/GetRequestTest/"}
		)
public class GetRequestTestRunner {

}
