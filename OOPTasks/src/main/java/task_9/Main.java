package task_9;

public class Main {
    public static void main(String[] args) throws Exception {
        User sergey = new User("rd",123, User.Names.Access.ADMIN);
        sergey.createQuery();

        User danil = new User("user",456,User.Names.Access.USER);
        danil.createQuery();

    }
}
