package com.Cucumber;

import org.junit.runner.RunWith;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Features\\Askomdch.feature", 
glue= {"com.Cucumber"},
monochrome= true,
plugin = {"pretty", "junit:Report.xml",
		"json:Report.json",
		"html:Report"} //"com.cucumber.listener.ExtentCucumberFormatter:Report/Askomdch.html"})
		)



public class Askomdch_Test_Runner {
	
	
		@Before
		public void beforeScenario(){
			System.out.println("This will run before the every Scenario");
		} 
		
		@Before
	    public void beforeScenarioStart(){
			System.out.println("-----------------Start of Scenario-----------------");
		}
		
		@After
		public void afterScenarioFinish(){
			System.out.println("-----------------End of Scenario-----------------");
		}
		
		@After
		public void afterScenario(){
			System.out.println("This will run after the every Scenario");
		}		


}
