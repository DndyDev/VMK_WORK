package ru.vmk.badCode.ducks;

import ru.vmk.badCode.Duck;
import ru.vmk.badCode.Quackable;

public class RubberDuck extends Duck implements Quackable {
    @Override
    public void display() {
        System.out.println("It's rubber duck");
    }

    @Override
    public void quack() {
        System.out.println("Squeak-squeak");
    }
}
