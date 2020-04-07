package task_9;

public class User {
    private String login;
    private int password;
    private INames.Access name;


    public User(String login, int password, INames.Access name) {
        this.name = name;
        this.login = login;
        this.password = password;
    }

    public void createQuery() throws Exception {
        try{
            Helper.checkRole(name);
            Query query = new Query();
            query.printToLog();

        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    interface INames {
        String connection = "Connection established";


        enum Access {
            ADMIN,
            USER;
        }
    }
interface Helper{

    class QueryException extends Exception {
        @Override
        public String toString() {
            return "User doesn't have rights for sending request";
        }
    }
    static void checkRole(INames.Access name) throws QueryException {
        if(name != INames.Access.ADMIN ){
            throw new QueryException();
        }
    }
}

    class Query {
        void printToLog() {
            System.out.println("User -- login: " + login + "; password:" + password + "; " + "send request for "
                    + INames.connection);
        }
    }
}
