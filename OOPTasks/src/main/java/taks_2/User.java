package taks_2;
/*
Переписать предыдущее задание*, используя Query как локальный класс (внут-ренний в соответствующем методе).
 */

public class User {

    private String login;
    private int password;


    public User(String login, int password) {
        this.login = login;
        this.password = password;
    }

    public IQuery createQuery(){
        class Query implements IQuery {
            public void printToLog() {
                System.out.println("User -- login: " + login + "; password:" + password + "; " + "send request");
            }
        }
        Query query = new Query();
        query.printToLog();
        return query;
    }
    public interface IQuery{
          void printToLog();
    }

}
