package ru.vmk.makduck.additivies;

import ru.vmk.makduck.AdditiviesDecorator;
import ru.vmk.makduck.Burger;

public class Tomato extends AdditiviesDecorator {
    Burger burger;
    public Tomato(Burger burger){
        this.burger = burger;
    }

    public double calories() {
        return burger.calories() + 2.0;
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ", Tomato";
    }
}
