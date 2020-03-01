package ru.vmk.myCode;

import ru.vmk.myCode.abstracts.CityVehicle;
import ru.vmk.myCode.interfaces.OnWheels;
import ru.vmk.myCode.interfaces.SoundOff;

public class Bike extends CityVehicle {
    public Bike(){
         sound = new SoundOff();
         go = new OnWheels();
    }

    @Override
    public void display() {
        System.out.println("It's bike");
    }

}
