package ru.vmk;

import ru.vmk.singleton.Singleton;

public class Main {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance("foo");
        System.out.println(singleton);
        Singleton anotherSingleton = Singleton.getInstance("boo");
        System.out.println(anotherSingleton);

    }
}
