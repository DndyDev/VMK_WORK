package ru.vmk.figures;

public class Adapter extends RoundPeg {
    private SquarePeg squarePeg;

    public Adapter(SquarePeg squarePeg) {
        this.squarePeg = squarePeg;
    }

    @Override
    public double   getRadius() {
        return squarePeg.getWidth() * Math.sqrt(2) / 2;
    }
}
