package ru.vmk;


import ru.vmk.enumS.Singleton;

public class Main {

//    public static void main(String[] args) {
//
//        System.out.println("If you see same value,then singleton was reused (yay !) \n" +
//                "If you see different values,then 2 singletons were created (boo !! ) \n" +
//                "RESULT: \n ");
//
//        Singleton foo = Singleton.getInstance("FOO");
//        System.out.println(foo.value);
//        Singleton bar = Singleton.getInstance("BAR");
//        System.out.println(bar.value);
//    }

    public static void main (String[] args) {
        Singleton enumSingleton = Singleton.INSTANCE;

        System.out.println(enumSingleton.getValue());
        enumSingleton.setValue(2);
        System.out.println(enumSingleton.getValue());
    }
}
