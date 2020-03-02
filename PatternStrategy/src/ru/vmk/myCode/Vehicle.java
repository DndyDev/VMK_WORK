package ru.vmk.myCode;

public abstract class Vehical {
    protected GoBehavior goBehavior;


    public Vehical() {
    }

    public abstract void display();

    public void setGo(GoBehavior go) {
        this.goBehavior = go;
    }

    public void performGo(){
        goBehavior.go();
    }
}
