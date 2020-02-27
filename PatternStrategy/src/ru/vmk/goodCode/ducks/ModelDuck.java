package ru.vmk.goodCode.ducks;

import ru.vmk.goodCode.Duck;
import ru.vmk.goodCode.FlyBehavior;
import ru.vmk.goodCode.QuackBehavior;
import ru.vmk.goodCode.flyInterfaces.FlyNoWay;
import ru.vmk.goodCode.quackInterfaces.Quack;

public class ModelDuck extends Duck {
    public ModelDuck() {
       FlyBehavior flyBehavior = new FlyNoWay();
        QuackBehavior quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
