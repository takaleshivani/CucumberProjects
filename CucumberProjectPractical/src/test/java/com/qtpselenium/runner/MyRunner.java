package com.qtpselenium.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		dryRun=false,
		features= {"src/test/resources/Feature"},
		glue = {"com.qtpselenium.testcases"},
		tags = "@LoginScenario",
		monochrome=true
		
		)
public class MyRunner {

}
