package ru.vmk.sensors;

public class FahrenheitSensor  {
    public double getFahrenheitTemp(){
        double t = 32.0;
        return t;
    }
    protected void adjust(){
        System.out.println("Starting sensor setup...");
    }
}
