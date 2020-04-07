package task_5;

public interface IQuery {
    static void printToLog(String login, int password ) {
        System.out.println("User -- login: " + login + "; password: " + password + " " + "send request");
    }
}
