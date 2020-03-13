package ru.vmk.ownCode;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot();
        DistanceSensor distanceSensor = new DistanceSensor(robot);
        robot.setMeasaruments(10,true);
    }

}
