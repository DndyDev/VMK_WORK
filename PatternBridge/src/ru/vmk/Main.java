package ru.vmk;

public class Main {

    public static void main(String[] args) {
        Shape [] shapes = {
                new Circle(new LargeCircleDrawer(),10,10,5 ),
                new Circle(new SmallCircleDrawer(),30,100, 20)
        };
        for(Shape next : shapes)  next.draw();

    }
}
