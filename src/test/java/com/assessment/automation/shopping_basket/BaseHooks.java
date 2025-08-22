package com.assessment.automation.shopping_basket;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BaseHooks {

	 @Before
	    public void beforeScenario() {
	        System.out.println(" - Starting Test Execution - ");
	    }

	    @After
	    public void afterScenario() {
	        System.out.println(" - End Test Execution - ");
	    }
	
}
