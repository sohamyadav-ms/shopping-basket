package com.assessment.automation.shopping_basket;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collections;

import org.junit.jupiter.api.BeforeEach;

public class JUnitTests {
	
	private ShoppingApplicationLogic calculator;
	
	
	@BeforeEach
    void setup() {
        calculator = new ShoppingApplicationLogic();
    }

    @Test
    void testEmptyBasket() {
        assertEquals(0, calculator.calculateTotal(Collections.emptyList()));
    }

    @Test
    void testSingleApple() {
        assertEquals(35, calculator.calculateTotal(Arrays.asList("Apple")));
    }

    @Test
    void testMultipleItemsWithoutOffers() {
        assertEquals(90, calculator.calculateTotal(Arrays.asList("Apple", "Banana", "Apple")));
    }

    @Test
    void testMelonOfferBuyOneGetOneFree() {
        assertEquals(50, calculator.calculateTotal(Arrays.asList("Melon", "Melon")));
    }

    @Test
    void testLimeOfferThreeForTwo() {
        assertEquals(30, calculator.calculateTotal(Arrays.asList("Lime", "Lime", "Lime")));
    }

    @Test
    void testMixedBasketWithOffers() {
        assertEquals(170, calculator.calculateTotal(Arrays.asList(
                "Apple", "Apple", "Banana", "Melon", "Melon", "Lime", "Lime", "Lime"
        )));
    }

    @Test
    void testCaseInsensitiveItems() {
        assertEquals(35, calculator.calculateTotal(Arrays.asList("apple")));
    }

    @Test
    void testUnknownItemIgnored() {
        assertEquals(0, calculator.calculateTotal(Arrays.asList("Chocolate")));
    }
}
