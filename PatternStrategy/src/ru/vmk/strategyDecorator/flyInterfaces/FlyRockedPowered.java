package ru.vmk.strategyDecorator.flyInterfaces;

import ru.vmk.strategyDecorator.FlyBehavior;

public class FlyRockedPowered extends FlyWithWings {
    FlyBehavior flyBehavior;

    public FlyRockedPowered() {
    }

    public FlyRockedPowered(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    //    Duck duck;
//    public FlyRockedPowered(Duck duck){
//        this.duck = duck;
//    }
    @Override
    public String fly(){
        return flyBehavior.fly() + " Jet Duck";
    }
}
