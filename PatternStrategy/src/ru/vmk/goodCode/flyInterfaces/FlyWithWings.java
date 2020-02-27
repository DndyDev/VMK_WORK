package ru.vmk.goodCode.flyInterfaces;

import ru.vmk.goodCode.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can fly !");
    }
}
