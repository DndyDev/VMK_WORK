package ru.vmk.abstractFactory;

public class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("Рисуем кнопку в стиле MacOS...");
    }
}
