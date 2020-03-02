package ru.vmk.myCode.interfaces;

import ru.vmk.myCode.SoundBehavior;

public class SoundOff implements SoundBehavior {

    @Override
    public void sound() {
        System.out.println("<<Silence>>");
    }
}
