package task_6;
/*
Переписать класс Query, используя вместо него внутренний или внешний ин-терфейс IQuery,
содержащий внутренний статический класс типа IQuery, реали-зующий метод printToLog.
 */
public class User {
    private String login;
    private int password;


    public User(String login, int password) {
        this.login = login;
        this.password = password;
    }

    public void createQuery(){
        IQuery.Query.printToLog(login,password);
    }
}
