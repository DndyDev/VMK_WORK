package taks_1;

public class Main {
    public static void main(String[] args) {
        User sergey = new User("rd",123);
        sergey.createQuery();
        User.Query uq = sergey.new Query();
        uq.printToLog();

        User.Query user = new User("login",321).new Query();
        user.printToLog();


    }
}
