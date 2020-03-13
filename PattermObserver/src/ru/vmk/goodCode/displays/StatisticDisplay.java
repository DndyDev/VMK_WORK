package ru.vmk.goodCode.displays;

import ru.vmk.goodCode.DisplayElement;
import ru.vmk.goodCode.Observer;
import ru.vmk.goodCode.Subject;

public class StatisticDisplay implements Observer, DisplayElement {
    private float temperature;
    private float temperatureSum;
    private Subject weatherData;
    private int counter;

    public StatisticDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        temperature += temp;
        counter++;
        display();
    }

    @Override
    public void display() {
        System.out.println("Middle value temperature:" + temperatureSum / counter);
    }
}
