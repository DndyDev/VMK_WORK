package ru.vmk.strategyDecorator.flyInterfaces;

import ru.vmk.strategyDecorator.FlyBehavior;

public class FlyRockedPowered extends FlyWithWings {
    FlyBehavior flyBehavior;

// Констурктор для переопределения поведения
    public FlyRockedPowered(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
//
    @Override
    public String fly(){
        return flyBehavior.fly() + " Jet Duck";
    }
}
