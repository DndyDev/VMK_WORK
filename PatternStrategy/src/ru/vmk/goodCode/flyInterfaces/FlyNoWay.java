package ru.vmk.goodCode.flyInterfaces;

import ru.vmk.goodCode.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
