package ru.vmk.ownCode;

import java.util.Observable;
import java.util.Observer;

public class DistanceSensor implements Observer, DisplayElement {
    private float distance;
    Observable observable;
    private boolean button;

    Robot robot = new Robot();

    public DistanceSensor(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }
    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof Robot){
//            Robot robot = (Robot)o;
            this.distance = robot.getDistance();
            this.button = robot.isButton();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Distance is " + distance);
    }
}
