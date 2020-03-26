package ru.vmk.abstractFactory;

public class WinCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Рисуем checkbox в стиле Windows");
    }
}
