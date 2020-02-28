package ru.vmk.myCode.interfaces;
import ru.vmk.myCode.GrabBehavior;

public class Graber implements GrabBehavior {
    @Override
    public void grab() {
        System.out.println("Grab everything");
    }
}
