package ru.vmk.myCode;

import ru.vmk.myCode.abstracts.CitiVehical;
import ru.vmk.myCode.interfaces.OnWheels;
import ru.vmk.myCode.interfaces.SoundOn;

public  class Car extends CitiVehical {
    public Car(){
        GoBehavior go = new OnWheels();
        SoudBehavior sound = new SoundOn();
    }

    @Override
    public void display() {
        System.out.println("This is the best car you ever saw");
    }
}
