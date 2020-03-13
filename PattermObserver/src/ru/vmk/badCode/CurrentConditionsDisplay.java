package ru.vmk.badCode;

public class CurrentConditionsDisplay {
    public void update( float temp, float humidity, float pressure){
        System.out.println("Температура: " + temp);
        System.out.println("Влажность: " + humidity);
        System.out.println("Давление: " + pressure );
    }
}
