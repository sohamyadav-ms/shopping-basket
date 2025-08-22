package com.assessment.automation.shopping_basket;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination {
	
	private List<String> basketItems;
    private int total;
    private final ShoppingApplicationLogic calculator = new ShoppingApplicationLogic();

	
	
	@Given("Following items are added to the basket")
	public void following_items_are_added_to_the_basket(io.cucumber.datatable.DataTable dataTable) {
		basketItems = new ArrayList<>();
        dataTable.asList().forEach(basketItems::add);
	}

	@When("I calculate the total price of all the items added to the basket")
	public void i_calculate_the_total_price_of_all_the_items_added_to_the_basket() {
		total = calculator.calculateTotal(basketItems);
	}

	@Then("the total price should be {int}")
	public void the_total_price_should_be(Integer expectedTotalCost) {
		Assert.assertEquals(total, expectedTotalCost.intValue(), "Total cost does not match expected value");
	}

}
