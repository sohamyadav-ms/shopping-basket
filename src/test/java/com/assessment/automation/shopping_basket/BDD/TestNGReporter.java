package com.assessment.automation.shopping_basket.BDD;

import java.io.FileWriter;
import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGReporter implements ITestListener{
	
	private static final String REPORT_FILE = "target/custom-testng-report.html";
    private static FileWriter writer;

    static {
        try {
            writer = new FileWriter(REPORT_FILE);
            writer.write("<html><head><title>Custom TestNG Report</title></head><body>");
            writer.write("<h1>Shopping Basket Test Execution Report</h1>");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        log("PASS", result);
    }

    @Override
    public void onTestFailure(ITestResult result) {
        log("FAIL", result);
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        log("SKIPPED", result);
    }

    @Override
    public void onFinish(ITestContext context) {
        try {
            writer.write("</body></html>");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Custom TestNG HTML Report generated: " + REPORT_FILE);
    }

    private void log(String status, ITestResult result) {
        try {
            writer.write("<p><b>" + result.getMethod().getMethodName() + "</b> - " + status + "</p>");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
