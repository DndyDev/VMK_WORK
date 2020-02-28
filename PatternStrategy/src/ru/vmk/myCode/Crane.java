package ru.vmk.myCode;

import ru.vmk.myCode.abstracts.BuildingVehicle;
import ru.vmk.myCode.interfaces.NoWheelsNeeded;
import ru.vmk.myCode.interfaces.NotGraber;

public class Crane extends BuildingVehicle {
    public Crane(){
         go = new NoWheelsNeeded();
         grab = new NotGraber();
    }
    @Override
    public void display() {
        System.out.println("It's biggest construction crane");
    }
}
