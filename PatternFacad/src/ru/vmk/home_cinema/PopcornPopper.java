package ru.vmk.home_cinema;

import java.io.IOException;

public class PopcornPopper {
    private String description = "Popcorn Popper";
     private String signal = null;


    public void on() {
        signal = "on";
        System.out.println(description + " " + signal);
    }

    public void off(){
        if (signal == "on"){
            System.out.println(description + " off");
        }else{
            System.out.println(description + " offed");
        }
    }

    public void pop() {
        System.out.println(description + " popping popcorn!");
    }


    public String toString() {
        return description;
    }

}
