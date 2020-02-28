package ru.vmk.myCode.interfaces;

import ru.vmk.myCode.GrabBehavior;

public class NotGraber implements GrabBehavior {
    @Override
    public void grab() {
        System.out.println("<<Helples>>");
    }
}
