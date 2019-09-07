package com.basic.TagsofCucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		tags={"@Important"}, // All scenario executed if this is tag for feature
		//tags={"@smoke"}, //only tag with @smoke
		//tags={"@Regression"}, //only tag with @regression
		//tags={"@Regression","@smoke"}, //@regression and @smoke execute
		//tags={"@Regression,@smoke"}, //@regression or @smoke execute
		//tags={"~@smoke"}, //exclude @smoke execute all
		dryRun=true,
		monochrome=true,
		features={"src/test/resources/com/basic/GetRequestTestFF2.feature",""},
		glue={"com/basic/TagsofCucumber/"}
		
		)
public class TagsofCucumberTestRunner {

}
