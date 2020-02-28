package ru.vmk.myCode.interfaces;

import ru.vmk.myCode.SoudBehavior;

public class SoundOFF implements SoudBehavior {

    @Override
    public void sound() {
        System.out.println("Beep-beep");
    }
}
