package ru.vmk.simpleFactory.factories;

import ru.vmk.simpleFactory.Pizza;
import ru.vmk.simpleFactory.PizzaStore;
import ru.vmk.simpleFactory.NYStilePizzas.NYStileCheesePizza;
import ru.vmk.simpleFactory.NYStilePizzas.NYStileClamPizza;
import ru.vmk.simpleFactory.NYStilePizzas.NYStilePepperoniPizza;
import ru.vmk.simpleFactory.NYStilePizzas.NYStileVegetablePizza;

public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new NYStileCheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new NYStilePepperoniPizza();
        } else if (type.equals("calm")) {
            pizza = new NYStileClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new NYStileVegetablePizza();
        }
        return pizza;
    }
}
