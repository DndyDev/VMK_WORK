package ru.vmk.house_builder;

public class Main {
    public static void main(String[] args) {
        House house = new HouseBuilder()
                .buildWindows(8)
                .buildRooms(5)
                .buildDoors(2)
                .buildWalls(4)
                .build();
        System.out.println(house);
    }
}
