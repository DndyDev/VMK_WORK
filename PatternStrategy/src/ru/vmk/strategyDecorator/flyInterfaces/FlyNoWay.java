package ru.vmk.strategyDecorator.flyInterfaces;

import ru.vmk.strategyDecorator.FlyBehavior;

public class FlyNoWay  implements FlyBehavior  {


    //    Duck duck;
//    public FlyNoWay(Duck duck){
//        this.duck = duck;
//    }
    @Override
    public String fly() {
        return "I can't fly";
    }
}
