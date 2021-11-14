package com.qa.Orange.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions( 
		features = {"./FeatureFile/"},
		glue = "com.qa.Orange.Definition",
		dryRun = false,
		monochrome = true
		
		
		
		)
public class StepRunner {

	
}
