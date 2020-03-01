package ru.vmk.myCode;

public abstract class Vehical {
    protected GoBehavior go;


    public Vehical(){}
    public abstract void display();

    public void setGo(GoBehavior go) {
        this.go = go;
    }
}
