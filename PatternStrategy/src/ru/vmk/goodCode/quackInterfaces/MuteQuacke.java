package ru.vmk.goodCode.quackInterfaces;

import ru.vmk.goodCode.QuackBehavior;

public class MuteQuacke implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<<Silence>>");
    }
}
