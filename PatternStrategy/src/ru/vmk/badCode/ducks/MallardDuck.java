package ru.vmk.badCode.ducks;

import ru.vmk.badCode.Duck;
import ru.vmk.badCode.Flyable;
import ru.vmk.badCode.Quackable;

public class MallardDuck extends Duck implements Quackable, Flyable {

    @Override
    public void display() {
        System.out.println("It's mallard");
    }

    @Override
    public void quack() {
        System.out.println("Quack-quack");
    }

    @Override
    public void fly() {
        System.out.println("I can fly !");
    }
}
