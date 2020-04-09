package ru.vmk.sensors;

public class Adapter  implements Sensor {
    private FahrenheitSensor fahrenheitSensor = new FahrenheitSensor();

    @Override
    public double getTemperature() {
        return fahrenheitSensor.getFahrenheitTemp() * 5.0 / 9.0;
    }

    @Override
    public void adjust() {
        fahrenheitSensor.adjust();
    }
}
