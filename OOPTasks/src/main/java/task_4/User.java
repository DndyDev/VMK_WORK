package task_4;
/*
Переписать класс Query как анонимный, расширяющий интерфейс IQuery, со-здав внутренний интерфейс IQuery,
    содержащий дефолтный метод printToLog.
 */
public class User {
    private String login;
    private int password;


    public User(String login, int password) {
        this.login = login;
        this.password = password;
    }
    class Query implements IQuery{
        @Override
        public void printToLog() {
            System.out.println("User -- login:" + login + "; password: "+ password + "; send request");
        }
    }
    public void createQuery(){
        IQuery query = new Query();
        query.printToLog();
    }
    interface IQuery{
        default void printToLog() {

        }
    }
}
