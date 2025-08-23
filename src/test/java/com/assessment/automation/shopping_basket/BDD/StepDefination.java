package com.assessment.automation.shopping_basket.BDD;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.Assert;

import com.assessment.automation.shopping_basket.ShoppingApplicationLogic;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination {
	
	private List<String> basketItems;
    private int total;
    private final ShoppingApplicationLogic calculator = new ShoppingApplicationLogic();

	
	
    @Given("An empty basket")
    public void given_empty_basket() {
        basketItems = new ArrayList<>();
    }

    @When("I calculate the total price")
    public void when_calculate_total_price() {
        total = calculator.calculateTotal(basketItems);
    }

    @Then("the total price should be {int}")
    public void then_total_price_should_be(Integer expected) {
        Assert.assertEquals(total, expected.intValue());
    }

    // ------------------- Scenario 2 -------------------
    @Given("A null basket")
    public void given_null_basket() {
        basketItems = null;
    }

    @When("I calculate the total price_a")
    public void when_calculate_total_price_a() {
        total = calculator.calculateTotal(basketItems);
    }

    @Then("a_the total price should be {int}")
    public void then_a_total_price_should_be(Integer expected) {
        Assert.assertEquals(total, expected.intValue());
    }

    // ------------------- Scenario 3 -------------------
    @Given("Following items are added to the basket_b")
    public void given_items_added_b(DataTable dataTable) {
        basketItems = new ArrayList<>(dataTable.asList());
    }

    @When("I calculate the total price_b")
    public void when_calculate_total_price_b() {
        total = calculator.calculateTotal(basketItems);
    }

    @Then("b_the total price should be {int}")
    public void then_b_total_price_should_be(Integer expected) {
        Assert.assertEquals(total, expected.intValue());
    }

    // ------------------- Scenario 4 -------------------
    @Given("Following items are added to the basket_c")
    public void given_items_added_c(DataTable dataTable) {
        basketItems = new ArrayList<>(dataTable.asList());
    }

    @When("I calculate the total price_c")
    public void when_calculate_total_price_c() {
        total = calculator.calculateTotal(basketItems);
    }

    @Then("c_the total price should be {int}")
    public void then_c_total_price_should_be(Integer expected) {
        Assert.assertEquals(total, expected.intValue());
    }

    // ------------------- Scenario 5 -------------------
    @Given("Following items are added to the basket_d")
    public void given_items_added_d(DataTable dataTable) {
        basketItems = new ArrayList<>(dataTable.asList());
    }

    @When("I calculate the total price_d")
    public void when_calculate_total_price_d() {
        total = calculator.calculateTotal(basketItems);
    }

    @Then("d_the total price should be {int}")
    public void then_d_total_price_should_be(Integer expected) {
        Assert.assertEquals(total, expected.intValue());
    }

    // ------------------- Scenario 6 -------------------
    @Given("Following items are added to the basket_e")
    public void given_items_added_e(DataTable dataTable) {
        basketItems = new ArrayList<>(dataTable.asList());
    }

    @When("I calculate the total price_e")
    public void when_calculate_total_price_e() {
        total = calculator.calculateTotal(basketItems);
    }

    @Then("e_the total price should be {int}")
    public void then_e_total_price_should_be(Integer expected) {
        Assert.assertEquals(total, expected.intValue());
    }

    // ------------------- Scenario 7 -------------------
    @Given("Following items are added to the basket_f")
    public void given_items_added_f(DataTable dataTable) {
        basketItems = new ArrayList<>(dataTable.asList());
    }

    @When("I calculate the total price_f")
    public void when_calculate_total_price_f() {
        total = calculator.calculateTotal(basketItems);
    }

    @Then("f_the total price should be {int}")
    public void then_f_total_price_should_be(Integer expected) {
        Assert.assertEquals(total, expected.intValue());
    }

    // ------------------- Scenario 8 -------------------
    @Given("Following items are added to the basket_g")
    public void given_items_added_g(DataTable dataTable) {
        basketItems = new ArrayList<>(dataTable.asList());
    }

    @When("I calculate the total price_g")
    public void when_calculate_total_price_g() {
        total = calculator.calculateTotal(basketItems);
    }

    @Then("g_the total price should be {int}")
    public void then_g_total_price_should_be(Integer expected) {
        Assert.assertEquals(total, expected.intValue());
    }

    // ------------------- Scenario 9 -------------------
    @Given("Following items are added to the basket_h")
    public void given_items_added_h(DataTable dataTable) {
        String joined = dataTable.asList().get(0);
        basketItems = Arrays.asList(joined.split("\\s*,\\s*"));
    }

    @When("I calculate the total price_h")
    public void when_calculate_total_price_h() {
        total = calculator.calculateTotal(basketItems);
    }

    @Then("h_the total price should be {int}")
    public void then_h_total_price_should_be(Integer expected) {
        Assert.assertEquals(total, expected.intValue());
    }

    // ------------------- Scenario 10 -------------------
    @Given("Following items are added to the basket_i")
    public void given_items_added_i(DataTable dataTable) {
        String joined = dataTable.asList().get(0);
        basketItems = Arrays.asList(joined.split("\\s*,\\s*"));
    }

    @When("I calculate the total price_i")
    public void when_calculate_total_price_i() {
        total = calculator.calculateTotal(basketItems);
    }

    @Then("i_the total price should be {int}")
    public void then_i_total_price_should_be(Integer expected) {
        Assert.assertEquals(total, expected.intValue());
    }

    // ------------------- Scenario 11 -------------------
    @Given("Following items are added to the basket_j")
    public void given_items_added_j(DataTable dataTable) {
        basketItems = new ArrayList<>(dataTable.asList());
    }

    @When("I calculate the total price_j")
    public void when_calculate_total_price_j() {
        total = calculator.calculateTotal(basketItems);
    }

    @Then("j_the total price should be {int}")
    public void then_j_total_price_should_be(Integer expected) {
        Assert.assertEquals(total, expected.intValue());
    }

    // ------------------- Scenario 12 -------------------
    @Given("Following items are added to the basket_k")
    public void given_items_added_k(DataTable dataTable) {
        basketItems = new ArrayList<>(dataTable.asList());
    }

    @When("I calculate the total price_k")
    public void when_calculate_total_price_k() {
        total = calculator.calculateTotal(basketItems);
    }

    @Then("k_the total price should be {int}")
    public void then_k_total_price_should_be(Integer expected) {
        Assert.assertEquals(total, expected.intValue());
    }

    // ------------------- Scenario 13 -------------------
    @Given("Following items are added to the basket_l")
    public void given_items_added_l(DataTable dataTable) {
        basketItems = new ArrayList<>(dataTable.asList());
    }

    @When("I calculate the total price_l")
    public void when_calculate_total_price_l() {
        total = calculator.calculateTotal(basketItems);
    }

    @Then("l_the total price should be {int}")
    public void then_l_total_price_should_be(Integer expected) {
        Assert.assertEquals(total, expected.intValue());
    }

    // ------------------- Scenario 14 -------------------
    @Given("Following items are added to the basket_m")
    public void given_items_added_m(DataTable dataTable) {
        basketItems = new ArrayList<>(dataTable.asList());
    }

    @When("I calculate the total price_m")
    public void when_calculate_total_price_m() {
        total = calculator.calculateTotal(basketItems);
    }

    @Then("m_the total price should be {int}")
    public void then_m_total_price_should_be(Integer expected) {
        Assert.assertEquals(total, expected.intValue());
    }

    // ------------------- Scenario 15 -------------------
    @Given("Following items are added to the basket_n")
    public void given_items_added_n(DataTable dataTable) {
        basketItems = new ArrayList<>(dataTable.asList());
    }

    @When("I calculate the total price_n")
    public void when_calculate_total_price_n() {
        total = calculator.calculateTotal(basketItems);
    }

    @Then("n_the total price should be {int}")
    public void then_n_total_price_should_be(Integer expected) {
        Assert.assertEquals(total, expected.intValue());
    }

}
