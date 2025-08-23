package com.assessment.automation.testdataprovider;

import java.util.List;

public class TestDataObjects {
	
	 private String name;
	    private List<String> basket;
	    private int expectedTotal;

	    public String getName() { return name; }
	    public void setName(String name) { this.name = name; }

	    public List<String> getBasket() { return basket; }
	    public void setBasket(List<String> basket) { this.basket = basket; }

	    public int getExpectedTotal() { return expectedTotal; }
	    public void setExpectedTotal(int expectedTotal) { this.expectedTotal = expectedTotal; }

}
