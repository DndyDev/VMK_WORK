package ru.vmk.strategyDecorator.quackInterfaces;

import ru.vmk.strategyDecorator.QuackBehavior;

public class Quack implements QuackBehavior {

    @Override
    public String quack() {
        return "Quake-quake";
    }
}
