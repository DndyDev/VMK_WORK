package task_8;

public class Main {
    public static void main(String[] args) throws Exception {
        User sergey = new User("rd",123, User.INames.Access.ADMIN);
        sergey.createQuery();

    }
}
