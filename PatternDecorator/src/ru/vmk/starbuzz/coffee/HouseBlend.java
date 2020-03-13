package ru.vmk.starbuzz.coffee;

import ru.vmk.starbuzz.Beverage;

public class HouseBlend extends Beverage {

    public HouseBlend(){
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }

}
