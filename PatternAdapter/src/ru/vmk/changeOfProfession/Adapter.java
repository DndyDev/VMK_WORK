package ru.vmk.changeOfProfession;

public class Adapter extends Plumber implements Chief {
    @Override
    public String makeBreakfast() {
        return getGasket();
    }

    @Override
    public String makeLunch() {
        return getPipe();
    }

    @Override
    public String makeDinner() {
        return getScrewNut();
    }
}
