package taks_1;

public class User {
    private String login;
    private int password;


    public User(String login, int password) {
        this.login = login;
        this.password = password;
    }

    public void createQuery(){
        Query query = new Query();
        query.printToLog();
    }
    class Query {
        void printToLog() {
            System.out.println("User -- login: " + login + "; password:" + password + "; " + "send request");
        }
    }
}



