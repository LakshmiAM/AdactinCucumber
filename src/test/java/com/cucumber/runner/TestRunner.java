package com.cucumber.runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.BaseClass;
import com.adactin.helper.FileReaderManager;
import com.adactin.helper.configurationReader;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/com/cucumber/feature/Adactin.feature", glue = "com\\cucumber\\stepdefinition", plugin = {
		/*"pretty", "html:Report/CucumberReport", "json:Repor/cucumber.json",*/
		"com.cucumber.listener.ExtentCucumberFormatter:Report/cucumberExtentReport.html" }, 
		monochrome = true, dryRun = false, strict = true)

public class TestRunner {

	public static WebDriver driver;

	@BeforeClass
	public static void sample() throws IOException {
		String browserName = FileReaderManager.getInstance().getCrInstance().getBrowserName();
		driver = BaseClass.getBrowser(browserName);
	}

	@AfterClass
	public static void tearDown() {
		driver.close();
	}
}
