package ru.vmk.goodCode.displays;

import ru.vmk.goodCode.DisplayElement;
import ru.vmk.goodCode.Observer;
import ru.vmk.goodCode.Subject;

public class ForecastDisplay implements Observer, DisplayElement {
    private Subject weatherData;
    public ForecastDisplay(Subject weatherData){
    this.weatherData = weatherData;
    weatherData.registerObserver(this);
    }
    @Override
    public void display() {
        System.out.println("good");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {

    }
}
