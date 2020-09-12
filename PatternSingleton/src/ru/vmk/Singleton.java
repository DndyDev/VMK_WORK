package ru.vmk;

public class Singleton {
    public static Singleton instance;
    public String value;

    private Singleton(String value) {
        System.out.println("Типа медленная инициализация");
        try {
            Thread.sleep(1000);

        }catch (InterruptedException ex){
            ex.printStackTrace();
        }
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        if (instance == null) {
            instance = new Singleton(value);
        }
        return instance;
    }


}


