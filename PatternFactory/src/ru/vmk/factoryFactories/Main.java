package ru.vmk.factoryFactories;

public class Main {
    public static void main(String[] args) {
        FactoriesFactory fFactory = new CarFactory();
        Factory factory = fFactory.createFactory(Car.FORD);
        factory.create(Model.HATCHBACK).description();

        Factory anotherFactory = fFactory.createFactory(Car.TOYOTA);
        factory.create(Model.HATCHBACK).start();
    }
}
