package ru.vmk.gui;

public class AnchorPane implements Element {
    int width;
    int height;

    public AnchorPane(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public void display() {

    }
}
