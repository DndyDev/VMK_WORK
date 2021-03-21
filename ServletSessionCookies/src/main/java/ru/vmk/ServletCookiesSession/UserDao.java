package ru.vmk.ServletCookiesSession;

import java.sql.*;
import java.util.ArrayList;

public class UserDao {

    public static User find (String insertLogin) throws SQLException {
        User user = null;
        try {
            String loginDB = "postgres";
            String passwordDB = "54484413310";
            String url = "jdbc:postgresql://localhost:5432/users";
            Connection connection = DriverManager.getConnection(url, loginDB, passwordDB);
            String SELECT_USER_BY_LOGIN = "SELECT * FROM users WHERE login=?";
            PreparedStatement statement = connection.prepareStatement(SELECT_USER_BY_LOGIN);
//            TODO: parameterIndex ?
            statement.setString(1, insertLogin);
            ResultSet set = statement.executeQuery();
            if(set.next()){
                int id = set.getInt(1);
                String name = set.getString(2);
                String login = set.getString(3);
                String password = set.getString(4);
                user = new User(name,login,password);
                user.setId(id);
            }

        } catch (Exception exception) {
            System.out.println(exception);
        }
        return user;
    }


}
