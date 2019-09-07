package com.basic.GetRequestDataDriven;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"src/test/resources/com/basic/GetRequestDataDrivenFF.feature"},
		glue={"com/basic/GetRequestDataDriven/"}
		)
public class GetRequestTestRunner {

}
