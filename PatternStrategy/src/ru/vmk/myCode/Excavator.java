package ru.vmk.myCode;

import ru.vmk.myCode.abstracts.BuildingVehicle;
import ru.vmk.myCode.interfaces.Graber;
import ru.vmk.myCode.interfaces.OnWheels;

public class Excavator extends BuildingVehicle {
    public Excavator(){
         grab = new Graber();
         go = new OnWheels();
    }

    @Override
    public void display() {
        System.out.println("It's Excavator");
    }
}
