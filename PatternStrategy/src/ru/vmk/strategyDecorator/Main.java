package ru.vmk.strategyDecorator;

import ru.vmk.strategyDecorator.ducks.MallardDuck;
import ru.vmk.strategyDecorator.ducks.ModelDuck;
import ru.vmk.strategyDecorator.ducks.ReadHeadDuck;
import ru.vmk.strategyDecorator.flyInterfaces.FlyRockedPowered;
import ru.vmk.strategyDecorator.flyInterfaces.FlyWithWings;

public class Main {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        Duck readHead = new ReadHeadDuck();
        Duck modelDuck = new ModelDuck();

        System.out.println(mallard.performFly());
        mallard.performQuack();

        readHead.performQuack();
        readHead.performFly();

        System.out.println(modelDuck.performFly());
        FlyBehavior flyBehavior = new FlyWithWings();
        flyBehavior = new FlyRockedPowered(flyBehavior);
        modelDuck.setFlyBehavior(flyBehavior);
        System.out.println(modelDuck.performFly());


    }
}
