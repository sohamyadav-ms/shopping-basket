package com.assessment.automation.shopping_basket.BDD;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com.assessment.automation.shopping_basket.BDD",
        plugin = {"pretty", "html:target/Cucumber-report.html", "json:target/cucumber.json"},
        monochrome = true
)

public class TestsCucumberTestNGRunner extends AbstractTestNGCucumberTests {

}
