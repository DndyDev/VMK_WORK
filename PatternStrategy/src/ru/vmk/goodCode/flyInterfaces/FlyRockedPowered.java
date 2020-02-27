package ru.vmk.goodCode.flyInterfaces;

import ru.vmk.goodCode.FlyBehavior;

public class FlyRockedPowered implements FlyBehavior {
    @Override
    public void fly(){
        System.out.println("Jet Duck");
    }
}
