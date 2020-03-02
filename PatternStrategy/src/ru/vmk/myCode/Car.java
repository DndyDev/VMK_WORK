package ru.vmk.myCode;

import ru.vmk.myCode.abstracts.CityVehicle;
import ru.vmk.myCode.interfaces.OnWheels;
import ru.vmk.myCode.interfaces.SoundOn;

public class Car extends CityVehicle {
    public Car() {
        goBehavior = new OnWheels();
        soundBehavior = new SoundOn();
    }

    public Car(GoBehavior goBehavior, SoundBehavior soundBehavior) {
        this.soundBehavior = soundBehavior;
        this.goBehavior = goBehavior;
    }

    @Override
    public void display() {
        System.out.println("This is the best car you ever saw");
    }
}
