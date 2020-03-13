package ru.vmk.ownCode;

import java.util.Observer;
import java.util.Observable;

public class Robot  {
    private float distance;
    private boolean button;
    private Observable observable;

    public Robot(){};

    public void measurementsChanged(){
        this.observable = observable;
        observable.setChanged();

        observable.notifyObservers();
    }

    public float getDistance() {
        return distance;
    }

    public boolean isButton() {
        return button;
    }

    public void setMeasaruments(float distance, boolean button){
        this.distance = distance;
        this.button = button;
        measurementsChanged();
    }
}
