package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        // your code goes here
       super.addExtraCheese();
       super.addExtraToppings();
       super.addTakeaway();
        System.out.println(super.getBill());
    }
}
