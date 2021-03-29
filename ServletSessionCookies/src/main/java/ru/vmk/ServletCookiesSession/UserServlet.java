package ru.vmk.ServletCookiesSession;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
@WebServlet("/user-servlet")
public class UserServlet extends HttpServlet {
    private UserDao userDao;
    private String login;
    private String password;
    @Override
    public void init() throws ServletException {
        super.init();
        try{
            Class.forName("org.postgresql.Driver");
            String loginDB = "postgres";
            String passwordDB = "qwerty007";
            String url = "jdbc:postgresql://localhost:5432/users";
            Connection connection = DriverManager.getConnection(url, loginDB, passwordDB);
            userDao = new UserDao(connection);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         login = req.getParameter("login");
         password = req.getParameter("password");

         User user = userDao.find(login);

        if(user.getPassword().equals(password)){
//            req.setAttribute("user", user);
            HttpSession session = req.getSession();
            Cookie sessionId = new Cookie("Session_id",session.getId());
            resp.addCookie(sessionId);

            session.setAttribute("user",user);

            Cookie loginCookie = new Cookie("userLogin",user.getLogin());
            Cookie passwordCookie = new Cookie("userPassword",user.getPassword());
            loginCookie.setMaxAge(3600);
            passwordCookie.setMaxAge(3600);
            resp.addCookie(loginCookie);
            resp.addCookie(passwordCookie);



            getServletContext().getRequestDispatcher("/loginSuccess.jsp").forward(req,resp);
        }else{
            PrintWriter out = resp.getWriter();
            out.println("wrong login or password");
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


    }
}
