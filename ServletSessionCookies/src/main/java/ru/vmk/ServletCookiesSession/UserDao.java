package ru.vmk.ServletCookiesSession;

import java.io.PrintWriter;
import java.sql.*;


public class UserDao {

    private  Connection connection;

    public UserDao(Connection connection) {
        this.connection = connection;
    }
     private  final String SELECT_USER_BY_LOGIN = "SELECT * FROM student WHERE login = ?";
     private  final String SELECT_USER_BY_ID = "SELECT * FROM student WHERE id = ?";

    public User find (String insertLogin) {
        User user = null;
        try {
            PreparedStatement statement = connection.prepareStatement(SELECT_USER_BY_LOGIN);
//            TODO: parameterIndex ?
            statement.setString(1, insertLogin);
            ResultSet set = statement.executeQuery();


            set.next();

            int id = set.getInt("id");
            String name = set.getString("name");
            String login = set.getString("login");
            String password = set.getString("password");
            user = new User(name,login,password);
            user.setId(id);


        } catch (Exception exception) {
            System.out.println(exception);
        }
        return user;
    }


}
