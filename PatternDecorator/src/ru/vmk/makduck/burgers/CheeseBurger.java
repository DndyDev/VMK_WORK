package ru.vmk.makduck.burgers;

import ru.vmk.makduck.Burger;

public class CheeseBurger extends Burger {
    public CheeseBurger(){
        description = "Cheeseburger";
    }
    @Override
    public double calories() {
        return 300;
    }
}
