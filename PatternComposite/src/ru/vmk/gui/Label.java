package ru.vmk.gui;

import java.util.Scanner;

public class Label implements Element {
    private int width;
    private int height;
     private String text;

    public Label(int width, int height) {
        this.width = width;
        this.height = height;
        this.text = "";
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }
    public void setText(){
        Scanner scanner = new Scanner(System.in);
        text = scanner.next();
    }

    @Override
    public void display() {
        System.out.println(text);
    }
}
