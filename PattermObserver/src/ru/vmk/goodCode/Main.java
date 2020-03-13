package ru.vmk.goodCode;

import ru.vmk.goodCode.displays.CurrentConditionsDisplay;
import ru.vmk.goodCode.displays.HeadIndexDisplay;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        HeadIndexDisplay headIndexDisplay = new HeadIndexDisplay(weatherData);
//        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
//        StatisticDisplay statisticDisplay = new StatisticDisplay(weatherData);
        weatherData.setMeasyrements(80,65,30.4f);
//        weatherData.setMeasyrements(82,79,29.2f);
//        weatherData.setMeasyrements(78,90,29.2f);
    }
}
