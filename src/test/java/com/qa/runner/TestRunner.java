package com.qa.runner;


import java.io.File;

import org.apache.commons.io.FileUtils;
import org.junit.runner.RunWith;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

import com.qa.util.TestBase;

import cucumber.api.CucumberOptions;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\sayali.sunil.kankate\\eclipse-workspace\\CucumberDemo\\src\\test\\java\\features\\dealsCount.feature", 
				 glue = "com\\qa\\stepdefinition", 
				 monochrome = true, 
				plugin = { "pretty", "html:report/htmlreports" },
			//	format= pretty,
				 dryRun = false, 
				 strict= true )
			

public class TestRunner extends TestBase{
	/*@After
	public void takeScreenshot(Scenario s) {
		if(s.isFailed()) {
			File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshot,"C:\\Users\\sayali.sunil.kankate\\eclipse-workspace\\CucumberDemo\\src"+s.getName());
			
			
		}*/
		
	/*
	 * @After public void embedScreenshot(Scenario scenario) throws Exception { if
	 * (scenario.isFailed()) { try { byte[] screenshot = ((TakesScreenshot)
	 * driver).getScreenshotAs(OutputType.BYTES); String testName =
	 * scenario.getName(); scenario.embed(screenshot, "image/png");
	 * scenario.write(testName); } catch (WebDriverException wde) {
	 * System.err.println(wde.getMessage()); } catch (ClassCastException cce) {
	 * cce.printStackTrace();} } }
	 */
		 	
	}

