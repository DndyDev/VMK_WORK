package ru.vmk.myCode.abstracts;

import ru.vmk.myCode.GrabBehavior;
import ru.vmk.myCode.Vehicle;

public abstract class BuildingVehicle extends Vehicle {
    protected GrabBehavior grabBehavior;

    public BuildingVehicle() {
    }

    public void performGrab() {
        grabBehavior.grab();
    }

    @Override
    public void performGo() {
        super.performGo();
    }
}
