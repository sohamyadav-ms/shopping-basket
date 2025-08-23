package com.assessment.automation.extentreport;

import java.util.Optional;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class ExtentReport implements TestWatcher{
	
	public static ExtentReports extent;

    static {
        // Use ExtentSparkReporter instead of ExtentHtmlReporter
        ExtentSparkReporter sparkReporter = new ExtentSparkReporter("target/extent-report.html");
        sparkReporter.config().setTheme(Theme.DARK);
        extent = new ExtentReports();
        extent.attachReporter(sparkReporter);
        sparkReporter.config().setDocumentTitle("Shopping Basket Test Report");
        sparkReporter.config().setReportName("JUnit Test Execution Report");

        extent = new ExtentReports();
        extent.attachReporter(sparkReporter);
    }

   
}
