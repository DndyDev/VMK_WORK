package ru.vmk.myCode.interfaces;

import ru.vmk.myCode.SoudBehavior;

public class SoundOff implements SoudBehavior {

    @Override
    public void sound() {
        System.out.println("<<Silence>>");
    }
}
