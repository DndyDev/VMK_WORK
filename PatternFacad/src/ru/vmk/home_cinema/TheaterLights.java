package ru.vmk.home_cinema;

public class TheaterLights {
    private String description = "Theater Light";


    public void on(){
        System.out.println(description + "on");
    }
    public void off(){
        System.out.println(description + "off");
    }
    public void dim(int level) {
        System.out.println(description + " dimming to " + level  + "%");
    }

    public String toString() {
        return description;
    }
}
