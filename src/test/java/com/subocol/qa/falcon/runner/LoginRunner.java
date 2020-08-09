package com.subocol.qa.falcon.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/login.feature",
		snippets = SnippetType.CAMELCASE,
		monochrome = true,
		glue = "com.subocol.qa.falcon.steps"
		,tags = "@Login"
)

public class LoginRunner {

	
	
}
