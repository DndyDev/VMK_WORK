package ru.vmk.makduck.burgers;

import ru.vmk.makduck.Burger;

public class ChickenBurger extends Burger {
    public ChickenBurger() {
        description = "Chickenburger";
    }

    @Override
    public double calories() {
        return 360;
    }
}
