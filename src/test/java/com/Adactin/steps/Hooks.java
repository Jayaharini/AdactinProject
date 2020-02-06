package com.Adactin.steps;

import java.io.IOException;

import com.Adactin.baseclass.FunctionlLib;
import com.cucumber.listener.Reporter;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	@Before
	public void beforeHook() {
		System.out.println("Before Scenario");
	}

	@After
	public void afterHook(Scenario scenario) throws IOException {
		if (scenario.isFailed()) {
			Reporter.addScreenCaptureFromPath(FunctionlLib.screenshot(scenario.getName()).getAbsolutePath());
		}
	}

}
