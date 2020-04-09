package ru.vmk.sensors;

/**
 * Реализация паттерна Адаптер на основе закрытого наследования
 *
 * Система должна поддерживать настройку измерений.
 * Так как доступ к защищённому методу через указатель запрещён.
 */
public class Main {

    public static void main(String[] args) {
        Sensor sensor = new Adapter();
        sensor.adjust();
        System.out.println("Celsius temperature " + sensor.getTemperature());
    }
}
