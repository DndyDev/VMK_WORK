package ru.vmk.myCode;

import ru.vmk.myCode.abstracts.CityVehicle;
import ru.vmk.myCode.interfaces.OnWheels;
import ru.vmk.myCode.interfaces.SoundOn;

public  class Car extends CityVehicle {
    public Car(){
         go = new OnWheels();
         sound = new SoundOn();
    }

    @Override
    public void display() {
        System.out.println("This is the best car you ever saw");
        go.go();
        sound.sound();
    }
}
