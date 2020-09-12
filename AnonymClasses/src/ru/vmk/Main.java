package ru.vmk;



public class Main {

    public static void main(String[] args) {
        /**
         * Создаём анонимный класс для одноразовой реализации интерфейса
         * Классическая реализация:
         *   AbleToEat animal = new AbleToEat() {
         *             @Override
         *             public void eat() {
         *                 System.out.println("Someone is eating...");
         *             }
         *         }
         *
         */

        AbleToEat animal = () -> System.out.println("Someone is eating...");
        animal.eat();
        AnimalDemo hyena = new AnimalDemo() {
            @Override
            public void move() {
                System.out.println("Catching up prey");
            }

            @Override
            public void noise() {
                System.out.println("He-he-he");
            }

            @Override
            public void eat() {
                System.out.println("");
            }
        };
    }
}
