package ru.vmk.badCode.ducks;

import ru.vmk.badCode.generaly.Duck;
import ru.vmk.badCode.interfaces.Quackable;

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
