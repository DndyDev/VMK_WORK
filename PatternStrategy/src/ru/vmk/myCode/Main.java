package ru.vmk.myCode;

import ru.vmk.myCode.abstracts.BuildingVehicle;
import ru.vmk.myCode.abstracts.CityVehicle;
import ru.vmk.myCode.interfaces.NoWheelsNeeded;

public class Main {
    public static void main(String[] args) {
        CityVehicle bike = new Bike();
        CityVehicle car = new Car();

        BuildingVehicle crane = new Crane();
        BuildingVehicle excavator = new Excavator();

        bike.display();
        bike.go.go();
        bike.setGo(new NoWheelsNeeded());
//        bike.sound.sound();
//        System.out.println();

//        car.display();
//        car.setGo(new NoWheelsNeeded());
//        System.out.println();
//
//        crane.display();
//        crane.go.go();
//        crane.grab.grab();
//        System.out.println();
//
//        crane.display();
//        excavator.go.go();
//        excavator.grab.grab();
//        System.out.println();
    }
}
