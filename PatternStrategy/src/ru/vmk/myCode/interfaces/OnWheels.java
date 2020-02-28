package ru.vmk.myCode.interfaces;

import ru.vmk.myCode.GoBehavior;

public class OnWheels implements GoBehavior {
    @Override
    public void go() {
        System.out.println("Leaves for sunset");
    }
}
