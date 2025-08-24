package com.assessment.automation.shopping_basket;

import java.util.HashMap;
import java.util.List;

public class ShoppingApplicationLogic {
	 private static final HashMap<String, Integer> PRICES = new HashMap<>();
	 
	 static{
		 PRICES.put("apple",35);
		 PRICES.put("banana",20);
		 PRICES.put("melon",50);
		 PRICES.put("lime",15);
	 }
	            
	 public int calculateTotal(List<String> items) {
    	
    	if (items == null || items.isEmpty()) {
            return 0;
        }
    	
        long melonCount = 0;
        long limeCount = 0;
        for (String item : items) {
            if (item.equalsIgnoreCase("melon")) {
                melonCount++;
            } else if (item.equalsIgnoreCase("lime")) {
                limeCount++;
            }
        }

        
        int total = 0;
		for (String item : items) {
		    if (!item.equalsIgnoreCase("melon") && !item.equalsIgnoreCase("lime")) {
		        total += PRICES.getOrDefault(item.toLowerCase(), 0);
		    }
		}
                

		int melonPrice = PRICES.get("melon");
		long freeMelons = melonCount / 2;
		long payMelons = melonCount - freeMelons;
		total += (int) (payMelons * melonPrice);

	
		int limePrice = PRICES.get("lime");
		long limeGroups = limeCount / 3;
		long remainingLimes = limeCount % 3;
		long payLimes = limeGroups * 2 + remainingLimes;
		total += (int) (payLimes * limePrice);

        return total;
    }
}
