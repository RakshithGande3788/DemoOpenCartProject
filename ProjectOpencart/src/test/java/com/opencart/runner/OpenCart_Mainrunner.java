package com.opencart.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;
import com.opencart.basepage.BasePage;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/feature/Opencart.feature",
				plugin = {"pretty", "html:reports/cucumber-html-report","json:reports/cucumber-html-report/jsonreport",
		"com.cucumber.listener.ExtentCucumberFormatter:reports/Extentreports/Extentreport.html"},
		//plugin = {"pretty", "html:reports/cucumber-html-report"},
		//tags = {"@tc01_login"},
		glue = {"com.opencart.StepDefinations"},
		monochrome = true
		//dryRun=false
		)
public class OpenCart_Mainrunner {
	 @AfterClass
     public static void extendReport()
   {
       Reporter.loadXMLConfig("src/test/resources/testdata/extend_reports.xml");
       Reporter.setSystemInfo("user", System.getProperty("user.name"));
       Reporter.setSystemInfo("os", "Windows");
       Reporter.setTestRunnerOutput("Sample test runner output message");
  

}
}