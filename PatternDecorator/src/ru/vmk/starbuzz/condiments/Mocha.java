package ru.vmk.starbuzz.condiments;

import ru.vmk.starbuzz.Beverage;
import ru.vmk.starbuzz.CondimentDecorator;

public class Mocha extends CondimentDecorator {
    Beverage beverage;
    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
}
