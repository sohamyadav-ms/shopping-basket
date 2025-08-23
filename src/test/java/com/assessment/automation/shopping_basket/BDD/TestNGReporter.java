package com.assessment.automation.shopping_basket.BDD;

import java.io.FileWriter;
import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGReporter implements ITestListener{
	
	private static final String REPORT_FILE = "target/testng-report.html";
    private static FileWriter writer;

    @Override
    public void onStart(ITestContext context) {
        try {
            writer = new FileWriter(REPORT_FILE);
            writer.write("<html><head><title>Shopping Basket Test Report</title></head><body>");
            writer.write("<h1>Shopping Basket Test Execution Report</h1>");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        log(result, "PASS");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        log(result, "FAIL");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        log(result, "SKIPPED");
    }

    private void log(ITestResult result, String status) {
        try {
            writer.write("<p>" + result.getMethod().getMethodName() + " - " + status + "</p>");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onFinish(ITestContext context) {
        try {
            writer.write("</body></html>");
            writer.close();
            System.out.println("Simple TestNG HTML Report generated: " + REPORT_FILE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
