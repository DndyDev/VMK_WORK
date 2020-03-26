package ru.vmk.simpleFactory;

import java.util.ArrayList;

public abstract class Pizza {
    protected String name;
    protected String dough;
    protected String sauce;
    protected ArrayList<String> toppings = new ArrayList<String>();

    public void prepare() {
        System.out.println("Preparing" + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding souse...");
        System.out.println("Adding toppings...");
        for (String toppings : toppings) {
            System.out.println(" " + toppings);
        }
    }

    public void bake() {
        System.out.println("Bakes for 25 minutes at 350 degrees  ");
    }

     void cut() {
        System.out.println("Seven pieces");
    }

    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }
}
