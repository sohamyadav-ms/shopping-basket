package com.assessment.automation.shopping_basket;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShoppingApplicationLogic {
	 private static final HashMap<String, Integer> PRICES = new HashMap<>();
	 
	 static{
		 PRICES.put("apple",35);
		 PRICES.put("banana",20);
		 PRICES.put("melon",50);
		 PRICES.put("lime",15);
	 }
	            
	 

	    /**
	     * Calculate the total basket cost in pence.
	     * Supports special offers:
	     * - Melons: Buy 1 get 1 free
	     * - Limes: 3 for the price of 2
	     *
	     * @param items List of item names
	     * @return total cost in pence
	     */
	    public int calculateTotal(List<String> items) {
	        long melonCount = items.stream().filter(i -> i.equalsIgnoreCase("melon")).count();
	        long limeCount = items.stream().filter(i -> i.equalsIgnoreCase("lime")).count();

	        // Total for items without special offers
	        int total = items.stream()
	                .filter(i -> !i.equalsIgnoreCase("melon") && !i.equalsIgnoreCase("lime"))
	                .mapToInt(i -> PRICES.getOrDefault(i.toLowerCase(), 0))
	                .sum();

	        // Apply melon offer: buy 1 get 1 free
	        total += ((melonCount / 2 + melonCount % 2) * PRICES.get("melon"));

	        // Apply lime offer: 3 for 2
	        total += ((limeCount / 3) * 2 * PRICES.get("lime")) + ((limeCount % 3) * PRICES.get("lime"));

	        return total;
	    }
}
