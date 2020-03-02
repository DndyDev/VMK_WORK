package ru.vmk.myCode;

import ru.vmk.myCode.abstracts.BuildingVehicle;
import ru.vmk.myCode.abstracts.CityVehicle;
import ru.vmk.myCode.interfaces.NoWheelsNeeded;

public class Main {
    public static void main(String[] args) {
        SoundBehavior extraSound = () -> System.out.println("<<Marseillaise>>");
        GoBehavior extraGo = () -> System.out.println("Don't stop");


        CityVehicle bike = new Bike();
        bike.display();
        bike.performGo();
        bike.setGo(new NoWheelsNeeded());
        bike.performGo();
        bike.performSound();
        System.out.println();

        CityVehicle car = new Car();
        car.display();
        car.setGo(new NoWheelsNeeded());
        car.performGo();
        car.performSound();
        System.out.println();

        car = new Car(extraGo, extraSound);
        car.performGo();
        car.performSound();
        System.out.println();


        BuildingVehicle crane = new Crane();
        crane.display();
        crane.performGo();
        crane.performGrab();
        System.out.println();

        BuildingVehicle excavator = new Excavator();
        excavator.display();
        excavator.performGo();
        excavator.performGrab();
        System.out.println();


    }
}
