package task_8;
/*
Создать внутренний приватный класс типа Exception, описывающий исключе-ние если,
    например, у пользователя нет прав отправлять запрос.
    Соответ-ственно, переписать метод createQuery с реализацией данного исключения.
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

    public void createQuery() throws Exception {
        if (names == INames.Access.ADMIN) {
            Query query = new Query();
            query.printToLog();
        } else {
            throw new QueryException();
        }
    }

    interface INames {
        String connection = "Connection established";


        enum Access {
            ADMIN,
            USER;
        }
    }

    class QueryException extends Exception {
        @Override
        public String toString() {
            return names.toString() + "  " + login + " doesn't have rights for sending request";
        }
    }

    class Query {
        void printToLog() {
            System.out.println("User -- login: " + login + "; password:" + password + "; " + "send request for "
                    + INames.connection);
        }
    }
}
