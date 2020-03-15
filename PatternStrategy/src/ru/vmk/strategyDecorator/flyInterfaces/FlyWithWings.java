package ru.vmk.strategyDecorator.flyInterfaces;

import ru.vmk.strategyDecorator.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    FlyBehavior flyBehavior;

    //    Duck duck;
//    public FlyWithWings (Duck duck){
//        this.duck = duck;
//    }
    @Override
    public String fly() {
        return "I can fly!";
    }
}
