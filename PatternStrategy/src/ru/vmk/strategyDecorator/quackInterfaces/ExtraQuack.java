package ru.vmk.strategyDecorator.quackInterfaces;

import ru.vmk.strategyDecorator.QuackBehavior;

public class ExtraQuack extends Quack {
    QuackBehavior quackBehavior;

    public ExtraQuack(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
    public String quack(){
        return quackBehavior.quack() +"<<Hymn>>";
    }

}
