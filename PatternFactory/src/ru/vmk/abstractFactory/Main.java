package ru.vmk.abstractFactory;

import java.awt.desktop.AppForegroundListener;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

//        Scanner scanner = new Scanner(System.in);
//        String config = scanner.next();
        String config = System.getProperty("os.name").toLowerCase();
        GUIFactory factory;

        if (config.startsWith("win")) {
            factory = new WinFactory();
        } else if (config.startsWith("mac")) {
            factory = new MacFactory();
        } else {
            throw new Exception("Error! Unknown operating system");
        }

        Application application = new Application(factory);
        application.createUI();
        application.paint();

    }
}
