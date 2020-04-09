package task_5;
/*
Переписать класс Query, используя вместо него внешний интерфейс IQuery, содержащий статический метод printToLog.
 */
public class User {
    private String login;
    private int password;


    public User(String login, int password) {
        this.login = login;
        this.password = password;
    }

    public void createQuery(){
        IQuery.printToLog(login,password);
    }
}
