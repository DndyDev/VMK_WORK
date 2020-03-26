package ru.vmk.factoryFactories;

public abstract class Motor {

   protected   abstract void description();

    protected void start() {
        System.out.println("Wrum-wrum");
    }
}
