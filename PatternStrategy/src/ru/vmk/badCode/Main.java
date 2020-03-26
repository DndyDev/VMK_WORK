package ru.vmk.badCode;

import ru.vmk.badCode.ducks.MallardDuck;
import ru.vmk.badCode.ducks.ReadHeadDuck;
import ru.vmk.badCode.ducks.RubberDuck;

public class Main {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        Duck readHeadDuck = new ReadHeadDuck();
        Duck rubberDuck = new RubberDuck();

        mallard.display();
        readHeadDuck.display();
        rubberDuck.display();

        mallard.swim();
        readHeadDuck.swim();
        rubberDuck.swim();

        mallard.fly();
        readHeadDuck.quack();
        rubberDuck.quack();
    }
}
