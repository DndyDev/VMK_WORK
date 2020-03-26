package ru.vmk.factoryFactories.factories;

import ru.vmk.factoryFactories.Factory;
import ru.vmk.factoryFactories.Model;
import ru.vmk.factoryFactories.Motor;
import ru.vmk.factoryFactories.ford.FordHathBackMotor;
import ru.vmk.factoryFactories.ford.FordHybridMotor;
import ru.vmk.factoryFactories.toyota.ToyotaHatchBackMotor;

public class FordFactory implements Factory {
    @Override
    public Motor create(Model type) {
        return switch(type){
            case HATCHBACK -> new FordHathBackMotor();
            case HYBRID -> new FordHybridMotor();
        };
    }
}
