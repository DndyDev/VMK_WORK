package ru.vmk.myCode.interfaces;

import ru.vmk.myCode.SoudBehavior;

public class SoundOn implements SoudBehavior {
    @Override
    public void sound() {
        System.out.println("<<Silence>>");
    }
}
