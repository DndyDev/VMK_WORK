package ru.vmk.abstractFactory;

public class MacCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Рисуем checkbox в стиле MacOS");
    }
}
