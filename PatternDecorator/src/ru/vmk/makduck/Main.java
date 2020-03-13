package ru.vmk.makduck;

import ru.vmk.makduck.additivies.Bekon;
import ru.vmk.makduck.additivies.Cucumbers;
import ru.vmk.makduck.additivies.Tomato;
import ru.vmk.makduck.burgers.HamBurger;

/**
 * Считаем калории,если слишком много, то ругаемся
 * и просим изменить состав.
 * 3000 kkl
 */
public class Main {
    public static void main(String[] args) {
        BMR sergey = new BMR(183, 70, 19);

        Burger burger1 = new HamBurger();

        burger1 = new Bekon(burger1);
        burger1 = new Tomato(burger1);
        burger1 = new Cucumbers(burger1);
        System.out.println(burger1.calories());
    }
}
