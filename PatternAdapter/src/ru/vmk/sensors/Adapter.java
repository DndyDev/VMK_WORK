package ru.vmk.sensors;

public class Adapter extends FahrenheitSensor implements Sensor {
    protected FahrenheitSensor fahrenheitSensor;

    public Adapter() {

    }

    @Override
    public double getTemperature() {
        return (getFahrenheitTemp() -32.0)*5.0/9.0;
    }

    @Override
    public void adjust() {
        fahrenheitSensor.adjust();
    }
}
