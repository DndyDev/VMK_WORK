package ru.vmk.Ducks;

public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Gooble-gooble");
    }

    @Override
    public void fly() {
        System.out.println("Turkey can fly too, but for short distance");
    }
}
