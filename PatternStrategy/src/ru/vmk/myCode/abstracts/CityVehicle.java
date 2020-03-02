package ru.vmk.myCode.abstracts;

import ru.vmk.myCode.SoundBehavior;
import ru.vmk.myCode.Vehicle;

public abstract class CityVehicle extends Vehicle {
    protected SoundBehavior soundBehavior;

    public CityVehicle() {
    }

    public void performSound() {
        soundBehavior.sound();
    }

    @Override
    public void performGo() {
        super.performGo();
    }

}
