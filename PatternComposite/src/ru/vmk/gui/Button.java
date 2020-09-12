package ru.vmk.gui;

public class Button  implements Element{
    private int width;
    private  int height;
    private boolean isClicked;

    public Button(int width, int height) {
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
//
    }
}
