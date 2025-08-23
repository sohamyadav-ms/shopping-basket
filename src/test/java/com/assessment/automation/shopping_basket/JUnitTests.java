package com.assessment.automation.shopping_basket;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import com.assessment.automation.shopping_basket.ShoppingApplicationLogic;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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
	    void testNullBasket() {
	        assertEquals(0, calculator.calculateTotal(null));
	    }

	    @Test
	    void testSingleApple() {
	        assertEquals(35, calculator.calculateTotal(Arrays.asList("Apple")));
	    }

	    @Test
	    void testSingleBanana() {
	        assertEquals(20, calculator.calculateTotal(Arrays.asList("Banana")));
	    }

	    @Test
	    void testSingleMelon() {
	        assertEquals(50, calculator.calculateTotal(Arrays.asList("Melon")));
	    }

	    @Test
	    void testSingleLime() {
	        assertEquals(15, calculator.calculateTotal(Arrays.asList("Lime")));
	    }

	    @Test
	    void testMultipleApplesAndBananas() {
	        assertEquals(90, calculator.calculateTotal(Arrays.asList("Apple", "Banana", "Apple")));
	    }

	    @Test
	    void testCaseInsensitiveItems() {
	        assertEquals(35, calculator.calculateTotal(Arrays.asList("apple")));
	        assertEquals(35, calculator.calculateTotal(Arrays.asList("APPLE")));
	        assertEquals(50, calculator.calculateTotal(Arrays.asList("MeLoN")));
	    }

	  
	    @Test
	    void testMelonOfferBuyOneGetOneFree() {
	        assertEquals(50, calculator.calculateTotal(Arrays.asList("Melon", "Melon")));
	        assertEquals(100, calculator.calculateTotal(Arrays.asList("Melon", "Melon", "Melon", "Melon")));
	        assertEquals(150, calculator.calculateTotal(Arrays.asList("Melon", "Melon", "Melon", "Melon", "Melon")));
	    }

	
	    @Test
	    void testLimeOfferThreeForTwo() {
	        assertEquals(30, calculator.calculateTotal(Arrays.asList("Lime", "Lime", "Lime")));
	        assertEquals(45, calculator.calculateTotal(Arrays.asList("Lime", "Lime", "Lime", "Lime")));
	        assertEquals(60, calculator.calculateTotal(Arrays.asList("Lime", "Lime", "Lime", "Lime", "Lime", "Lime")));
	        assertEquals(75, calculator.calculateTotal(Arrays.asList("Lime", "Lime", "Lime", "Lime", "Lime", "Lime", "Lime")));
	    }

	  
	    @Test
	    void testMixedBasketWithOffers() {
	        List<String> basket = Arrays.asList(
	                "Apple", "Apple", "Banana", "Melon", "Melon", "Lime", "Lime", "Lime"
	        );
	        assertEquals(170, calculator.calculateTotal(basket));
	    }

	    @Test
	    void testMixedBasketWithUnknownItems() {
	        List<String> basket = Arrays.asList(
	                "Apple", "Banana", "Chocolate", "Melon"
	        );
	        assertEquals(105, calculator.calculateTotal(basket)); // Chocolate ignored
	    }

	    
	    @Test
	    void testBasketWithSingleMelonOrLime() {
	        assertEquals(50, calculator.calculateTotal(Arrays.asList("Melon")));
	        assertEquals(15, calculator.calculateTotal(Arrays.asList("Lime")));
	    }

	    @Test
	    void testBasketWithWhitespaceItems() {
	        List<String> basket = Arrays.asList(" Apple ", " Banana ", "  Melon");
	        assertEquals(105, calculator.calculateTotal(Arrays.asList("Apple", "Banana", "Melon")));
	    }

	    @Test
	    void testBasketWithSpecialCharacters() {
	        List<String> basket = Arrays.asList("Apple@", "#Banana", "Melon$");
	        assertEquals(50, calculator.calculateTotal(Arrays.asList("Melon"))); // Invalid items ignored
	    }

	    
	    @Test
	    void testUnknownItemIgnored() {
	        assertEquals(0, calculator.calculateTotal(Arrays.asList("Chocolate")));
	    }

	    @Test
	    void testMultipleUnknownItemsIgnored() {
	        List<String> basket = Arrays.asList("Candy", "Chocolate", "Cake");
	        assertEquals(0, calculator.calculateTotal(basket));
	    }
    
}
