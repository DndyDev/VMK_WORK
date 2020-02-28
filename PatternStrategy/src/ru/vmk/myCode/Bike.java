package ru.vmk.myCode;

import ru.vmk.myCode.abstracts.CitiVehical;
import ru.vmk.myCode.interfaces.OnWheels;
import ru.vmk.myCode.interfaces.SoundOFF;

public class Bike extends CitiVehical {
    public Bike(){
         sound = new SoundOFF();
         go = new OnWheels();
    }

    @Override
    public void display() {
        System.out.println("It's bike");
    }

}
