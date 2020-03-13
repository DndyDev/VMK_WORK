package ru.vmk.makduck;

public abstract class Burger {
    protected String description = "Unknown burger";
    public abstract double calories();

    public String getDescription() {
        return description;
    }
}
