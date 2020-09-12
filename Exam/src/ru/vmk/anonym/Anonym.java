package ru.vmk.anonym;

public class Anonym {
    public static void main(String[] args) {
          Runnable anonym = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello world !");
            }

        };
        Runnable anonym3 =  anonym.getClass().newInstance();
        Runnable anonym2 =  () -> {
            System.out.println("I'm amomym");
        };
    }
}
