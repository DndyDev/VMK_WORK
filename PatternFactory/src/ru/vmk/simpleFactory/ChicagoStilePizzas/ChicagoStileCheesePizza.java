package ru.vmk.simpleFactory.ChicagoStilePizzas;

import ru.vmk.simpleFactory.Pizza;

public class ChicagoStileCheesePizza extends Pizza {
    public ChicagoStileCheesePizza(){
        name = "Chicago Style Deep Dish Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }
     void cut(){
        System.out.println("Cutting the pizza into square slices");
    }
}
