package ru.vmk.makduck;

public  class BMR {
     int height;
    double weight;
    int age;

    public BMR(int height, double weight, int age) {
        this.height = height;
        this.weight = weight;
        this.age = age;
    }

    public  String counting (Burger burger){
         double countBurgers = Math.round((88.36 + 13.4 * weight + 4.8 * height - 5.7 * age) / burger.calories());

        return "Дневная норма бургеров:" + countBurgers;
    }
}
