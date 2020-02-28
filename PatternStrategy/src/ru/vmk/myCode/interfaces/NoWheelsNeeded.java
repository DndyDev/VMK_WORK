package ru.vmk.myCode.interfaces;

import ru.vmk.myCode.GoBehavior;

public class NoWheelsNeeded implements GoBehavior {
    @Override
    public void go() {
        System.out.println("Driving is not the true way");
    }
}
