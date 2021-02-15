package ru.vmk.factoryFactories;

import ru.vmk.factoryFactories.factories.FordFactory;
import ru.vmk.factoryFactories.factories.ToyotaFactory;

public class CarFactory implements FactoriesFactory {
    @Override
    public  Factory createFactory(Car type) {
        return switch (type){
            case FORD -> new FordFactory();
            case TOYOTA -> new ToyotaFactory();

        };
    }
}
