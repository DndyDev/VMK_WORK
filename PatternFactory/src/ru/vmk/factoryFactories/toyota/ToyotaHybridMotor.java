package ru.vmk.factoryFactories.toyota;

import ru.vmk.factoryFactories.Motor;

public class ToyotaHybridMotor extends Motor {
    @Override
    protected void description() {
        System.out.println("Japan gas and electric engine");
    }
}
