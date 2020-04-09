package task_3;
/*
Переписать класс Query, как статический класс.
 */
public class User {
    private String login;
    private int password;


    public User(String login, int password) {
        this.login = login;
        this.password = password;
    }

    public void createQuery(){
//        Query.printToLog(login, password);
        Query.printToLog(this);
    }
    static class Query {
//        static void printToLog(String qLogin,int qPassword) {
//            System.out.println("User -- login: " + qLogin + "; password:" + qPassword + "; " + "send request");
//        }
        static void printToLog(User user){
            System.out.println("User -- login: " + user.login + "; password:" + user.password + "; " + "send request");
        }
    }
}