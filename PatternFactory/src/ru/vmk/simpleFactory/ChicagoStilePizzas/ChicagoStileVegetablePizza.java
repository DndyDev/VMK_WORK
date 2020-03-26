package ru.vmk.simpleFactory.ChicagoStilePizzas;

import ru.vmk.simpleFactory.Pizza;

public class ChicagoStileVegetablePizza extends Pizza {
    @Override
    public void bake() {
        System.out.println("Vegetable pizza baked");
    }


    @Override
    public void prepare() {
        System.out.println("Vegetable pizza is served with salad ");
    }

}
