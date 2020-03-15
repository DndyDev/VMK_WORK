package ru.vmk.strategyDecorator.ducks;

import ru.vmk.strategyDecorator.Duck;
import ru.vmk.strategyDecorator.flyInterfaces.FlyNoWay;
import ru.vmk.strategyDecorator.quackInterfaces.Quack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
