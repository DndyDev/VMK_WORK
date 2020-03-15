package ru.vmk.strategyDecorator.ducks;

import ru.vmk.strategyDecorator.Duck;
import ru.vmk.strategyDecorator.flyInterfaces.FlyWithWings;
import ru.vmk.strategyDecorator.quackInterfaces.Quack;

public class ReadHeadDuck extends Duck {
    public ReadHeadDuck(){
         quackBehavior = new Quack();
         flyBehavior = new FlyWithWings();
    }


    @Override
    public void display() {
        System.out.println("It's real read head duck !");
    }
}
