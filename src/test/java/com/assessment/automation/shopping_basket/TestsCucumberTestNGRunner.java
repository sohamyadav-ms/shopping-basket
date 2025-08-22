package com.assessment.automation.shopping_basket;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com.assessment.automation.shopping_basket",
        plugin = {"pretty", "html:target/cucumber-reports.html", "json:target/cucumber.json"},
        monochrome = true
)

public class TestsCucumberTestNGRunner extends AbstractTestNGCucumberTests {

}
