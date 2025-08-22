package com.assessment.automation.shopping_basket;

public class BaseModel {
	
	private String name;
    private int price; // price in pence

    public BaseModel(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Item{name='" + name + "', price=" + price + "}";
    }

}
