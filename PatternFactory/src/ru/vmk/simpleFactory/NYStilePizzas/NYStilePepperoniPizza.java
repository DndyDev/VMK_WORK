package ru.vmk.simpleFactory.NYStilePizzas;

import ru.vmk.simpleFactory.Pizza;

public class NYStilePepperoniPizza extends Pizza {

    @Override
    public void bake() {
        System.out.println("Pepperoni pizza baked");
    }


    @Override
    public void prepare() {
        System.out.println("Pepperoni pizza is served with ketchup");
    }

}
