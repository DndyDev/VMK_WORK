package ru.vmk.house_builder;

public class House {
    int windows;
    int rooms;
    int doors;
    int walls;
    boolean hasSwimPool;
    boolean hasGarage;


    public House(){}

    public House(int windows, int rooms, int doors, int walls, boolean hasSwimPool, boolean hasGarage) {
        this.windows = windows;
        this.rooms = rooms;
        this.doors = doors;
        this.walls = walls;
        this.hasSwimPool = hasSwimPool;
        this.hasGarage = hasGarage;
    }

    public int getWindows() {
        return windows;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getWalls() {
        return walls;
    }

    public void setWalls(int walls) {
        this.walls = walls;
    }

    public boolean isHasSwimPool() {
        return hasSwimPool;
    }

    public void setHasSwimPool(boolean hasSwimPool) {
        this.hasSwimPool = hasSwimPool;
    }

    public boolean isHasGarage() {
        return hasGarage;
    }

    public void setHasGarage(boolean hasGarage) {
        this.hasGarage = hasGarage;
    }

    @Override
    public String toString() {
        return "Windows = " + windows + ", rooms = " + rooms
                + ", doors = " + doors + ", walls = " + walls
                + ", hasSwimPool = " + hasSwimPool + ", hasGarage = " + hasGarage;

    }
}
