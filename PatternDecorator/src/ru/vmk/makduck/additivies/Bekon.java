package ru.vmk.makduck.additivies;

import ru.vmk.makduck.AdditiviesDecorator;
import ru.vmk.makduck.Burger;

public class Bekon extends AdditiviesDecorator {
    Burger burger;
    public Bekon(Burger burger){
        this.burger = burger;
    }
    @Override
    public double calories(){
        return burger.calories() + 30;
    }
    @Override
    public String getDescription() {
        return burger.getDescription() + ", Bekon";
    }
}
