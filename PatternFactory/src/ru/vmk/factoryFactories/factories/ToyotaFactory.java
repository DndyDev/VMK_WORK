package ru.vmk.factoryFactories.factories;

import ru.vmk.factoryFactories.Factory;
import ru.vmk.factoryFactories.Model;
import ru.vmk.factoryFactories.Motor;
import ru.vmk.factoryFactories.toyota.ToyotaHatchBackMotor;
import ru.vmk.factoryFactories.toyota.ToyotaHybridMotor;

public class ToyotaFactory implements Factory {

    @Override
    public Motor create(Model type) {
        return switch(type){
            case HYBRID ->  new ToyotaHybridMotor();
            case HATCHBACK -> new ToyotaHatchBackMotor();
        };
    }
}
