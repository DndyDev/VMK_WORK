package ru.vmk.changeOfProfession;

/**
 * Реализация паттерна Адартер через наследование
 */
public class Client {
    public static void eat(String dish){
        System.out.println("Употребляет " + dish);
    }
    public static void callAmbulance(){
        System.out.println("Звонит в больничку");
    }

    public static void main(String[] args) {
        Chief fakeChief = new Adapter();
        String dish = fakeChief.makeBreakfast();
        eat(dish);
        dish = fakeChief.makeLunch();
        eat(dish);
        dish = fakeChief.makeDinner();
        eat(dish);
        callAmbulance();
    }
}
