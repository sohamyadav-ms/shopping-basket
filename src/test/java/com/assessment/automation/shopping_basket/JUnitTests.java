package com.assessment.automation.shopping_basket;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;

import com.assessment.automation.extentreport.ExtentReport;
import com.assessment.automation.testdataprovider.TestDataLoader;
import com.assessment.automation.testdataprovider.TestDataObjects;
import com.aventstack.extentreports.ExtentTest;

import org.junit.jupiter.api.BeforeEach;


public class JUnitTests {
	
	private ShoppingApplicationLogic calculator;
	
	
	@BeforeEach
    void setup() {
        calculator = new ShoppingApplicationLogic();
    }

	@AfterAll
    static void tearDown() {
		
        ExtentReport.extent.flush();
    }
	
	 @Test
	    void testEmptyBasket() {
	        TestDataObjects testCase = TestDataLoader.getTestCaseByName("Empty Basket");
	        ExtentTest test = ExtentReport.extent.createTest(testCase.getName());
	        try {
	            test.info("List of Items in Basket Items: " + testCase.getBasket());
	            test.info("Expected Total Cost: " + testCase.getExpectedTotal());

	            int actualTotal = calculator.calculateTotal(testCase.getBasket());
	            test.info("Actual Total Cost: " + actualTotal);

	            assertEquals(testCase.getExpectedTotal(), actualTotal);
	            test.pass("Test Passed");

	        } catch (AssertionError e) {
	            test.fail("Test Failed | " + e.getMessage());
	            throw e;
	        }
	    }

	    @Test
	    void testNullBasket() {
	    	TestDataObjects testCase = TestDataLoader.getTestCaseByName("Null Basket");
	    	ExtentTest test = ExtentReport.extent.createTest(testCase.getName());
	        try {
	            test.info("List of Items in Basket Items: " + testCase.getBasket());
	            test.info("Expected Total Cost: " + testCase.getExpectedTotal());

	            int actualTotal = calculator.calculateTotal(testCase.getBasket());
	            test.info("Actual Total Cost: " + actualTotal);

	            assertEquals(testCase.getExpectedTotal(), actualTotal);
	            test.pass("Test Passed");

	        } catch (AssertionError e) {
	            test.fail("Test Failed | " + e.getMessage());
	            throw e;
	        }
	    }

	    @Test
	    void testSingleApple() {
	    	TestDataObjects testCase = TestDataLoader.getTestCaseByName("Single Apple");
	    	ExtentTest test = ExtentReport.extent.createTest(testCase.getName());
	        try {
	            test.info("List of Items in Basket Items: " + testCase.getBasket());
	            test.info("Expected Total Cost: " + testCase.getExpectedTotal());

	            int actualTotal = calculator.calculateTotal(testCase.getBasket());
	            test.info("Actual Total Cost: " + actualTotal);

	            assertEquals(testCase.getExpectedTotal(), actualTotal);
	            test.pass("Test Passed");

	        } catch (AssertionError e) {
	            test.fail("Test Failed | " + e.getMessage());
	            throw e;
	        }
	    }

	    @Test
	    void testSingleBanana() {
	    	TestDataObjects testCase = TestDataLoader.getTestCaseByName("Single Banana");
	    	ExtentTest test = ExtentReport.extent.createTest(testCase.getName());
	        try {
	            test.info("List of Items in Basket Items: " + testCase.getBasket());
	            test.info("Expected Total Cost: " + testCase.getExpectedTotal());

	            int actualTotal = calculator.calculateTotal(testCase.getBasket());
	            test.info("Actual Total Cost: " + actualTotal);

	            assertEquals(testCase.getExpectedTotal(), actualTotal);
	            test.pass("Test Passed");

	        } catch (AssertionError e) {
	            test.fail("Test Failed | " + e.getMessage());
	            throw e;
	        }
	    }

	    @Test
	    void testSingleMelon() {
	    	TestDataObjects testCase = TestDataLoader.getTestCaseByName("Single Melon");
	    	ExtentTest test = ExtentReport.extent.createTest(testCase.getName());
	        try {
	            test.info("List of Items in Basket Items: " + testCase.getBasket());
	            test.info("Expected Total Cost: " + testCase.getExpectedTotal());

	            int actualTotal = calculator.calculateTotal(testCase.getBasket());
	            test.info("Actual Total Cost: " + actualTotal);

	            assertEquals(testCase.getExpectedTotal(), actualTotal);
	            test.pass("Test Passed");

	        } catch (AssertionError e) {
	            test.fail("Test Failed | " + e.getMessage());
	            throw e;
	        }
	    }

	    @Test
	    void testSingleLime() {
	    	TestDataObjects testCase = TestDataLoader.getTestCaseByName("Single Lime");
	    	ExtentTest test = ExtentReport.extent.createTest(testCase.getName());
	        try {
	            test.info("List of Items in Basket Items: " + testCase.getBasket());
	            test.info("Expected Total Cost: " + testCase.getExpectedTotal());

	            int actualTotal = calculator.calculateTotal(testCase.getBasket());
	            test.info("Actual Total Cost: " + actualTotal);

	            assertEquals(testCase.getExpectedTotal(), actualTotal);
	            test.pass("Test Passed");

	        } catch (AssertionError e) {
	            test.fail("Test Failed | " + e.getMessage());
	            throw e;
	        }
	    }

	    @Test
	    void testMultipleApplesAndBananas() {
	    	TestDataObjects testCase = TestDataLoader.getTestCaseByName("Multiple Apples And Bananas");
	    	ExtentTest test = ExtentReport.extent.createTest(testCase.getName());
	        try {
	            test.info("List of Items in Basket Items: " + testCase.getBasket());
	            test.info("Expected Total Cost: " + testCase.getExpectedTotal());

	            int actualTotal = calculator.calculateTotal(testCase.getBasket());
	            test.info("Actual Total Cost: " + actualTotal);

	            assertEquals(testCase.getExpectedTotal(), actualTotal);
	            test.pass("Test Passed");

	        } catch (AssertionError e) {
	            test.fail("Test Failed | " + e.getMessage());
	            throw e;
	        }
	    }

	    @Test
	    void testCaseInsensitiveItems() {
	    	TestDataObjects testCase = TestDataLoader.getTestCaseByName("Case Insensitive Items");
	    	ExtentTest test = ExtentReport.extent.createTest(testCase.getName());
	        try {
	            test.info("List of Items in Basket Items: " + testCase.getBasket());
	            test.info("Expected Total Cost: " + testCase.getExpectedTotal());

	            int actualTotal = calculator.calculateTotal(testCase.getBasket());
	            test.info("Actual Total Cost: " + actualTotal);

	            assertEquals(testCase.getExpectedTotal(), actualTotal);
	            test.pass("Test Passed");

	        } catch (AssertionError e) {
	            test.fail("Test Failed | " + e.getMessage());
	            throw e;
	        }
	    }

	    @Test
	    void testMelonOfferBuyOneGetOneFree() {
	    	TestDataObjects testCase = TestDataLoader.getTestCaseByName("Melon Offer Buy One Get One Free");
	    	ExtentTest test = ExtentReport.extent.createTest(testCase.getName());
	        try {
	            test.info("List of Items in Basket Items: " + testCase.getBasket());
	            test.info("Expected Total Cost: " + testCase.getExpectedTotal());

	            int actualTotal = calculator.calculateTotal(testCase.getBasket());
	            test.info("Actual Total Cost: " + actualTotal);

	            assertEquals(testCase.getExpectedTotal(), actualTotal);
	            test.pass("Test Passed");

	        } catch (AssertionError e) {
	            test.fail("Test Failed | " + e.getMessage());
	            throw e;
	        }
	    }

	    @Test
	    void testLimeOfferThreeForTwo() {
	    	TestDataObjects testCase = TestDataLoader.getTestCaseByName("Lime Offer Three For Two");
	    	ExtentTest test = ExtentReport.extent.createTest(testCase.getName());
	        try {
	            test.info("List of Items in Basket Items: " + testCase.getBasket());
	            test.info("Expected Total Cost: " + testCase.getExpectedTotal());

	            int actualTotal = calculator.calculateTotal(testCase.getBasket());
	            test.info("Actual Total Cost: " + actualTotal);

	            assertEquals(testCase.getExpectedTotal(), actualTotal);
	            test.pass("Test Passed");

	        } catch (AssertionError e) {
	            test.fail("Test Failed | " + e.getMessage());
	            throw e;
	        }
	    }

	    @Test
	    void testMixedBasketWithOffers() {
	    	TestDataObjects testCase = TestDataLoader.getTestCaseByName("Mixed Basket With Offers");
	    	ExtentTest test = ExtentReport.extent.createTest(testCase.getName());
	        try {
	            test.info("List of Items in Basket Items: " + testCase.getBasket());
	            test.info("Expected Total Cost: " + testCase.getExpectedTotal());

	            int actualTotal = calculator.calculateTotal(testCase.getBasket());
	            test.info("Actual Total Cost: " + actualTotal);

	            assertEquals(testCase.getExpectedTotal(), actualTotal);
	            test.pass("Test Passed");

	        } catch (AssertionError e) {
	            test.fail("Test Failed | " + e.getMessage());
	            throw e;
	        }
	    }

	    @Test
	    void testMixedBasketWithUnknownItems() {
	    	TestDataObjects testCase = TestDataLoader.getTestCaseByName("Mixed Basket With Unknown Items");
	    	ExtentTest test = ExtentReport.extent.createTest(testCase.getName());
	        try {
	            test.info("List of Items in Basket Items: " + testCase.getBasket());
	            test.info("Expected Total Cost: " + testCase.getExpectedTotal());

	            int actualTotal = calculator.calculateTotal(testCase.getBasket());
	            test.info("Actual Total Cost: " + actualTotal);

	            assertEquals(testCase.getExpectedTotal(), actualTotal);
	            test.pass("Test Passed");

	        } catch (AssertionError e) {
	            test.fail("Test Failed | " + e.getMessage());
	            throw e;
	        }
	    }

	    @Test
	    void testBasketWithWhitespaceItems() {
	    	TestDataObjects testCase = TestDataLoader.getTestCaseByName("Basket With Whitespace Items");
	    	ExtentTest test = ExtentReport.extent.createTest(testCase.getName());
	        try {
	            test.info("List of Items in Basket Items: " + testCase.getBasket());
	            test.info("Expected Total Cost: " + testCase.getExpectedTotal());

	            int actualTotal = calculator.calculateTotal(testCase.getBasket());
	            test.info("Actual Total Cost: " + actualTotal);

	            assertEquals(testCase.getExpectedTotal(), actualTotal);
	            test.pass("Test Passed");

	        } catch (AssertionError e) {
	            test.fail("Test Failed | " + e.getMessage());
	            throw e;
	        }
	    }

	    @Test
	    void testBasketWithSpecialCharacters() {
	    	TestDataObjects testCase = TestDataLoader.getTestCaseByName("Basket With Special Characters");
	    	ExtentTest test = ExtentReport.extent.createTest(testCase.getName());
	        try {
	            test.info("List of Items in Basket Items: " + testCase.getBasket());
	            test.info("Expected Total Cost: " + testCase.getExpectedTotal());

	            int actualTotal = calculator.calculateTotal(testCase.getBasket());
	            test.info("Actual Total Cost: " + actualTotal);

	            assertEquals(testCase.getExpectedTotal(), actualTotal);
	            test.pass("Test Passed");

	        } catch (AssertionError e) {
	            test.fail("Test Failed | " + e.getMessage());
	            throw e;
	        }
	    }

	    @Test
	    void testMultipleUnknownItemsIgnored() {
	    	TestDataObjects testCase = TestDataLoader.getTestCaseByName("Multiple Unknown Items Ignored");
	    	ExtentTest test = ExtentReport.extent.createTest(testCase.getName());
	        try {
	            test.info("List of Items in Basket Items: " + testCase.getBasket());
	            test.info("Expected Total Cost: " + testCase.getExpectedTotal());

	            int actualTotal = calculator.calculateTotal(testCase.getBasket());
	            test.info("Actual Total Cost: " + actualTotal);

	            assertEquals(testCase.getExpectedTotal(), actualTotal);
	            test.pass("Test Passed");

	        } catch (AssertionError e) {
	            test.fail("Test Failed | " + e.getMessage());
	            throw e;
	        }
	    }
    
}
