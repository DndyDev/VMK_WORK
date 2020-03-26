package ru.vmk.simpleFactory.NYStilePizzas;

import ru.vmk.simpleFactory.Pizza;

public class NYStileVegetablePizza extends Pizza {
    @Override
    public void bake() {
        System.out.println("Vegetable pizza baked");
    }


    @Override
    public void prepare() {
        System.out.println("Vegetable pizza is served with salad ");
    }

}
