package ru.vmk.strategyDecorator.quackInterfaces;

import ru.vmk.strategyDecorator.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public String quack() {
        return "<<Silence>>";
    }
}
