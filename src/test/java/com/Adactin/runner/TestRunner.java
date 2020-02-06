package com.Adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Adactin.baseclass.FunctionlLib;
import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(plugin = {
		"com.cucumber.listener.ExtentCucumberFormatter:src\\test\\resources\\com\\Adactin\\reports\\Reports.html",

		"pretty", "json:src\\test\\resources\\com\\Adactin\\reports\\Areport.json",
		"junit:src\\test\\resources\\com\\Adactin\\reports\\Areport.xml",
		"html:src\\test\\resources\\com\\Adactin\\reports\\Areport.html" },

		features = "src\\test\\java\\com\\Adactin\\feature\\Adactin.feature",

		glue = "com.Adactin.steps",

		dryRun = false, strict = true, monochrome = true,

		tags = "@Adactin"

)

public class TestRunner {

	public static WebDriver driver;

	@BeforeClass
	public static void initDriver() {
		FunctionlLib.browserLaunch();
	}

	@AfterClass
	public static void quitDriver() {
		FunctionlLib.driverQuit();
		Reporter.loadXMLConfig(
				System.getProperty("user.dir") + "\\src\\test\\resources\\com\\Adactin\\props\\extent-report.xml");

	}

}
