package org.virtusaproject.stepdefinitions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\admin\\eclipse-workspace\\VirtusaProject\\src\\test\\resources\\FeatureFile\\tShirtOrderExe.feature",
glue="org.virtusaproject.stepdefinitions",monochrome=true,dryRun=false,plugin = {"html:target"})

public class Runner {

	
}
