package ru.vmk.strategyDecorator.quackInterfaces;

import ru.vmk.strategyDecorator.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public String quack() {
        return "Squeak-squeak";
    }
}
