package ru.vmk.simpleFactory.factories;

import ru.vmk.simpleFactory.ChicagoStilePizzas.ChicagoStileClamPizza;
import ru.vmk.simpleFactory.ChicagoStilePizzas.ChicagoStilePepperoniPizza;
import ru.vmk.simpleFactory.ChicagoStilePizzas.ChicagoStileVegetablePizza;
import ru.vmk.simpleFactory.ChicagoStilePizzas.ChicagoStileCheesePizza;
import ru.vmk.simpleFactory.Pizza;
import ru.vmk.simpleFactory.PizzaStore;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new ChicagoStileCheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new ChicagoStilePepperoniPizza();
        } else if (type.equals("calm")) {
            pizza = new ChicagoStileClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new ChicagoStileVegetablePizza();
        }
        return pizza;
    }
}
