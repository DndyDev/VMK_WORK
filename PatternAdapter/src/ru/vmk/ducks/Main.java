package ru.vmk.ducks;

public class Main {
    public static void main(String[] args) {
        MallardDuck mallard = new MallardDuck();
        WildTurkey turkey = new WildTurkey();

        Adapter turkeyNotDuck = new Adapter(turkey);

        System.out.println("The Turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\n The Ducks says...");
        duckTest(mallard);
        System.out.println();
        duckTest(turkeyNotDuck);

        System.out.println();


    }
    static void duckTest(Duck duck){
        duck.fly();
        duck.quack();
    }
}
