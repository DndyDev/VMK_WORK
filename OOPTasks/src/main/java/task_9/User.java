package task_9;
/*
Перенести класс исключения в интерфейс IHelper и
    в этом же интерфейсе реа-лизовать метод checkRole с использованием данного исключения.
    Метод checkRole затем использовать в логике метода createQuery.
 */
public class User {
    private String login;
    private int password;
    private Names.Access name;


    public User(String login, int password, Names.Access name) {
        this.name = name;
        this.login = login;
        this.password = password;
    }

    public void createQuery() throws Exception {
        try {
            Helper.checkRole(name);
            Query query = new Query();
            query.printToLog();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    interface Names {
        String connection = "Connection established";


        enum Access {
            ADMIN,
            USER;
        }
    }

    interface Helper {

        class QueryException extends Exception {
            @Override
            public String toString() {
                return "User doesn't have rights for sending request";
            }
        }

        static void checkRole(Names.Access name) throws QueryException {
            if (name != Names.Access.ADMIN) {
                throw new QueryException();
            }
        }
    }

    class Query {
        void printToLog() {
            System.out.println("User -- login: " + login + "; password:" + password + "; " + "send request for "
                    + Names.connection);
        }
    }
}
