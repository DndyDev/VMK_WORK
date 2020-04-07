package taks_2;

public class User {
    private String login;
    private int password;


    public User(String login, int password) {
        this.login = login;
        this.password = password;
    }

    public void createQuery(){
        class Query {
            void printToLog() {
                System.out.println("User -- login: " + login + "; password:" + password + "; " + "send request");
            }
        }
        Query query = new Query();
        query.printToLog();
    }

}
