package ru.vmk.myCode;

public abstract class Vehicle {
    protected GoBehavior goBehavior;


    public Vehicle() {
    }

    public abstract void display();

    public void setGo(GoBehavior go) {
        this.goBehavior = go;
    }

    public void performGo(){
        goBehavior.go();
    }
}
