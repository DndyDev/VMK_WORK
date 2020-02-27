package ru.vmk.goodCode;

import ru.vmk.goodCode.ducks.MallardDuck;
import ru.vmk.goodCode.ducks.ModelDuck;
import ru.vmk.goodCode.ducks.ReadHeadDuck;
import ru.vmk.goodCode.flyInterfaces.FlyRockedPowered;

public class Main {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        Duck readHead = new ReadHeadDuck();
        Duck modelDuck = new ModelDuck();

        mallard.performFly();
        mallard.performQuack();

        readHead.performQuack();
        readHead.performFly();

        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRockedPowered());
        modelDuck.performFly();


    }
}
