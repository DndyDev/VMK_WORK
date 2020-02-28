package ru.vmk.goodCode.ducks;

import ru.vmk.goodCode.Duck;
import ru.vmk.goodCode.FlyBehavior;
import ru.vmk.goodCode.QuackBehavior;
import ru.vmk.goodCode.flyInterfaces.FlyWithWings;
import ru.vmk.goodCode.quackInterfaces.Quack;

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
