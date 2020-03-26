package ru.vmk.factoryFactories.ford;

import ru.vmk.factoryFactories.Motor;

public class FordHathBackMotor extends Motor {
    @Override
   protected void description() {
        System.out.println("American gas engine");
    }
}
