package ru.vmk;

public class Circle extends Shape {
    private int x;
    private int y;
    private int radius;

    protected Circle(Drawer drawer, int x, int y, int radius) {
        super(drawer);
        setX(x);
        setY(y);
        setRadius(radius);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {

    }

    @Override
    public void enlargeRadius(int multiplier) {

    }
}
