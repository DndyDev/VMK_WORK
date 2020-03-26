package ru.vmk.simpleFactory.NYStilePizzas;

import ru.vmk.simpleFactory.Pizza;

public class NYStileCheesePizza extends Pizza {
    public NYStileCheesePizza() {
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara sauce";
        toppings.add("Graded Reggiano Cheese");
    }
}
