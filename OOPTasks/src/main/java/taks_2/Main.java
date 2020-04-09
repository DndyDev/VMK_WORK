package taks_2;

import task_6.IQuery;

public class Main {
    public static void main(String[] args) {
//        User sergey = new User("rd",123);
        User.IQuery sergey = new User("rd",123).createQuery();

    }
}
