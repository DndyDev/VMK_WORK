package ru.vmk.myCode.interfaces;

import ru.vmk.myCode.SoundBehavior;

public class SoundOn implements SoundBehavior {
    @Override
    public void sound() {
        System.out.println("Beep-beep");
    }
}
