package ru.vmk.makduck.additivies;

import ru.vmk.makduck.AdditiviesDecorator;
import ru.vmk.makduck.Burger;

public class Cheese extends AdditiviesDecorator {
    Burger burger;
    public Cheese(Burger burger){
        this.burger = burger;
    }

    public double calories(){
        return burger.calories() + 4.02;
    }
    @Override
    public String getDescription() {
        return burger.getDescription() + ", Cheese";
    }
}
