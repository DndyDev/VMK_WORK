package ru.vmk.simpleFactory.NYStilePizzas;

import ru.vmk.simpleFactory.Pizza;

 public class NYStileClamPizza extends Pizza {
    @Override
    public void bake() {
        System.out.println("Clam pizza baked");
    }

    @Override
    public void prepare() {
        System.out.println("Clam pizza is served with soy sauce");
    }

}
