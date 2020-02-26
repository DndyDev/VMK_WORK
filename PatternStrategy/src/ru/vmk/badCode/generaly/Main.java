package ru.vmk.badCode.generaly;

import ru.vmk.badCode.ducks.MallardDuck;
import ru.vmk.badCode.ducks.ReadHeadDuck;
import ru.vmk.badCode.ducks.RubberDuck;

public class Main {

    public static void main(String[] args) {
        MallardDuck mallard = new MallardDuck();
        ReadHeadDuck readHeadDuck = new ReadHeadDuck();
        RubberDuck rubberDuck = new RubberDuck();

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
