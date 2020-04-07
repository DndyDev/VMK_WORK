package task_3;

public class User {
    private String login;
    private int password;


    public User(String login, int password) {
        this.login = login;
        this.password = password;
    }

    public void createQuery(){
        Query.printToLog(login,password);
    }
    static class Query {
        static void printToLog(String qLogin,int qPassword) {
            System.out.println("User -- login: " + qLogin + "; password:" + qPassword + "; " + "send request");
        }
    }
}