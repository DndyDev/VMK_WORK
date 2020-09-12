package ru.vmk.initializationOnDemandHolder;

/**
 * Решение Билла Пью
 */

public class Singleton {
    private Singleton() {
    }
    private static class SingletonHolder{
        private static final Singleton instance = new Singleton();
    }
    public static Singleton getInstance(){
        return SingletonHolder.instance;
    }
}
