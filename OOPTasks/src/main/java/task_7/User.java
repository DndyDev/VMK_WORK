package task_7;
/*
Создать внутренний интерфейс INames, как пространство имен для данной предметной области,
а именно, содержащий Enum и константы (например, ти-пы прав доступа пользователей, строка соединения и т.д.)
 */
public class User {
    private String login;
    private int password;
    private INames.Access names;


    public User(String login, int password, INames.Access names) {
        this.names = names;
        this.login = login;
        this.password = password;
    }
    public void createQuery() {
        Query query = new Query();
        query.printToLog();
    }
    interface INames{
        String connection = "Connection established";


        enum Access {
            ADMIN,
            USER;
        }
    }
    class Query{
        void printToLog(){
            System.out.println("User -- login: " + login + "; password:" + password + "; " + "send request for "
                    + INames.connection);
        }
    }

}
