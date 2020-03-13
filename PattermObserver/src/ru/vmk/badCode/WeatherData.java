package ru.vmk.badCode;

public class WeatherData {
    float temperature;
    float humidity;
    float pressure;
    CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay();
    StatisticDisplay statisticDisplay = new StatisticDisplay();
    ForecastDisplay forecastDisplay = new ForecastDisplay();

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void measurementsChanged(){
        float temp = getTemperature();
        float humidity = getHumidity();
        float pressure = getPressure();

        currentConditionsDisplay.update(temp,humidity,pressure);
        statisticDisplay.update(temp,humidity,pressure);
        forecastDisplay.update(temp,humidity,pressure);
    }
}
