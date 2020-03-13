package ru.vmk.starbuzz.coffee;

import ru.vmk.starbuzz.Beverage;

public class Espresso extends Beverage {
    public Espresso(){
        description = "Espresso";
    }
    @Override
    public double cost() {
        return 1.99;
    }

}
