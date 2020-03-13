package ru.vmk.makduck.burgers;

import ru.vmk.makduck.Burger;

public class HamBurger extends Burger {
    public HamBurger() {
        description = "Hamburger";
    }

    @Override
    public double calories() {
        return 253;
    }
}
