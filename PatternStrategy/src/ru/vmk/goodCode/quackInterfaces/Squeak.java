package ru.vmk.goodCode.quackInterfaces;

import ru.vmk.goodCode.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak-squeak");
    }
}
