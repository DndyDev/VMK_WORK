package ru.vmk.goodCode.quackInterfaces;

import ru.vmk.goodCode.QuackBehavior;

public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Quake-quake");
    }
}
