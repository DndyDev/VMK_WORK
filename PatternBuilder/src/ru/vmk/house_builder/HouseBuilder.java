package ru.vmk.house_builder;

import ru.vmk.car_builder.Builder;

import java.util.Scanner;
//ToDo: Переделать в приватный статический вариант
public  class HouseBuilder extends House {
    private static int windows = 3;
    private static int rooms = 3;
    private static int doors = 1;
    private static int walls = 4;
    private static boolean hasSwimPool;
    private static boolean hasGarage;


    private static HouseBuilder buildWindows(int windowsCount) {
        windows = windowsCount;
        return this;
    }
    public static HouseBuilder buildRooms(int roomsCount) {
        rooms = roomsCount;
        return this;
    }


    public static HouseBuilder buildDoors(int doorsCount) {
        doors = doorsCount;
        return this;
    }


    public static HouseBuilder buildWalls(int wallsCount) {
        boolean iglu = false;
        if (wallsCount > 2) {
            walls = wallsCount;

        } else {
            System.out.println("Строим иглу ? Если нет, то пожалуйста добавьте ещё стену");
            Scanner scanner = new Scanner(System.in);
            iglu =  scanner.nextBoolean();
        }
        if (iglu) {
            walls = wallsCount + 1;
        }
        return this;
    }


    public static HouseBuilder buildSwimPool(boolean hasSwimPool) {
        this.hasSwimPool = hasSwimPool;
        return this;
    }


    public static HouseBuilder buildGarage(boolean hasGarage) {
        this.hasGarage = hasGarage;
        return this;
    }
     public static House build(){
        House house = new House();
        house.setWindows(windows);
        house.setRooms(rooms);
        house.setDoors(doors);
        house.setWalls(walls);
        house.setHasGarage(hasGarage);
        house.setHasSwimPool(hasSwimPool);
        return house;
    }
}
