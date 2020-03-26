package ru.vmk.simpleFactory.ChicagoStilePizzas;

import ru.vmk.simpleFactory.Pizza;

public class ChicagoStilePepperoniPizza extends Pizza {

    @Override
    public void bake() {
        System.out.println("Pepperoni pizza baked");
    }


    @Override
    public void prepare() {
        System.out.println("Pepperoni pizza is served with ketchup");
    }

}
