package task_6;

public interface IQuery {
    static class Query {
        static void printToLog(String login, int password) {
            System.out.println("User -- login: " + login + "; password: " + password + " " + "send request");
        }

    }
}
