package com.assessment.automation.extentreport;

import org.junit.jupiter.api.extension.TestWatcher;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class ExtentReport implements TestWatcher{
	
	public static ExtentReports extent;

    static {
        ExtentSparkReporter sparkReporter = new ExtentSparkReporter("target/JUnitTests-extent-report.html");
        sparkReporter.config().setTheme(Theme.DARK);
        extent = new ExtentReports();
        extent.attachReporter(sparkReporter);
        sparkReporter.config().setDocumentTitle("Shopping Basket Test Report");
        sparkReporter.config().setReportName("JUnit Test Execution Report");

        extent = new ExtentReports();
        extent.attachReporter(sparkReporter);
    }

   
}
