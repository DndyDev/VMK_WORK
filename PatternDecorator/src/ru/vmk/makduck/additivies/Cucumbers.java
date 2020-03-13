package ru.vmk.makduck.additivies;

import ru.vmk.makduck.AdditiviesDecorator;
import ru.vmk.makduck.Burger;

public class Cucumbers extends AdditiviesDecorator {
    Burger burger;
    public Cucumbers (Burger burger){
        this.burger = burger;
    }

    @Override
    public double calories() {
        return burger.calories() + 1.5;
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ", Bekon" ;
    }
}
