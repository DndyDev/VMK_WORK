package ru.vmk.badCode.ducks;

import ru.vmk.badCode.Duck;
import ru.vmk.badCode.Flyable;
import ru.vmk.badCode.Quackable;

public class ReadHeadDuck extends Duck implements Quackable, Flyable {
    @Override
    public void display() {
        System.out.println("It's read head duck");
    }

    @Override
    public void fly() {
        System.out.println("I can fly !");
    }

    @Override
    public void quack() {
        System.out.println("Quack-quack");
    }
}
