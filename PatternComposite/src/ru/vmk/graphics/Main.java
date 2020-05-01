package ru.vmk.figures;

public class Main {

    public static void main(String[] args) {
        Ellipse ellipse = new Ellipse();
        Ellipse ellipse1 = new Ellipse();
        Ellipse ellipse2 = new Ellipse();
        Ellipse ellipse3 = new Ellipse();

        Composite graphic = new Composite();
        Composite graphic1 = new Composite();
        Composite graphic2 = new Composite();

        graphic.add(ellipse);
        graphic.add(ellipse1);
        graphic.add(ellipse2);

        graphic1.add(ellipse3);

        graphic.add(graphic1);
        graphic.add(graphic2);

        graphic.print();
    }
}
