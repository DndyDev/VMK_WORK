package ru.vmk.goodCode.displays;

import ru.vmk.goodCode.DisplayElement;
import ru.vmk.goodCode.Observer;
import ru.vmk.goodCode.Subject;

public class ThirdPartyDisplay implements Observer, DisplayElement {
    Subject weatherData;

    public ThirdPartyDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {

    }

    @Override
    public void update(float temp, float humidity, float pressure) {

    }
}
