package com.assessment.automation.shopping_basket;

import java.util.List;

public class utils {
	

    /**
     * Checks if the basket contains any invalid items.
     *
     * @param items List of item names
     * @param allowedItems List of valid item names
     * @return true if all items are valid, false otherwise
     */
    public static boolean validateItems(List<String> items, List<String> allowedItems) {
        return items.stream().allMatch(i -> allowedItems.contains(i.toLowerCase()));
    }

}
