package task_4;

public class User {
    private String login;
    private int password;


    public User(String login, int password) {
        this.login = login;
        this.password = password;
    }

    public void createQuery(){
        IQuery query = () ->
                "User -- login: " + login + "; password:" + password + "; " + "send request";
        System.out.println(query);
    }
    interface IQuery{
        String printToLog();
    }
}
