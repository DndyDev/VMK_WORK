package ru.vmk;

public class Main {

    public static void main(String[] args) {
	final Duck duck = NotADuck.asDuck(new Dog(),ru.vmk.Duck.class);
	Dog dog = new Dog();
	dog.makeNoise();
//	duck.makeNoise();

    }

}
