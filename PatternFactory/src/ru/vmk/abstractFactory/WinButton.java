package ru.vmk.abstractFactory;

public class WinButton implements Button{
    @Override
    public void paint() {
        System.out.println("Рисуем кнопку в стиле Windows...");
    }
}
