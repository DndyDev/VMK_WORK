package ru.vmk.strategyDecorator.ducks;

import ru.vmk.strategyDecorator.Duck;
import ru.vmk.strategyDecorator.flyInterfaces.FlyWithWings;
import ru.vmk.strategyDecorator.quackInterfaces.Quack;

public class MallardDuck extends Duck {
    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    @Override
    public void display() {
        System.out.println("It's mallard");
    }
}
