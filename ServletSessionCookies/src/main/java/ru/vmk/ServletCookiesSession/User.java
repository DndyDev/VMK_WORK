package ru.vmk.ServletCookiesSession;

public class User {
    private  int id;
    private String name;
    private String login;
    private String password;
    private int userCounter = 0;

    public User(String name, String login, String password) {
        this.name = name;
        this.login = login;
        this.password = password;
        userCounter++;

    }

    public int getId() {
        return id;
    }

    public void setId(int id){
        this.id = id;
        if (userCounter < id){
            userCounter = id;
        }
    }

    public String getName() {
        return name;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
}
