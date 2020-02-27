package ru.vmk.goodCode;

import ru.vmk.goodCode.ducks.MallardDuck;
import ru.vmk.goodCode.ducks.ReadHeadDuck;

public class Main {
    public static void main(String[] args) {
        MallardDuck mallard = new MallardDuck();
        ReadHeadDuck readHead = new ReadHeadDuck();
//        mallard.performFly();
//        mallard.performQuack();

        readHead.performQuack();
        readHead.performFly();
    }
}
