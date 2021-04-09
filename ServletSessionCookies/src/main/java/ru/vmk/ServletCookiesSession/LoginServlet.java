package ru.vmk.ServletCookiesSession;

import ru.vmk.ServletCookiesSession.image.Namespace;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
@WebServlet("/login-servlet")
public class LoginServlet extends HttpServlet {
    private UserDao userDao;
    private String login;
    private String password;

    @Override
    public void init() throws ServletException {
        super.init();
        try{
            Class.forName("org.postgresql.Driver");
            String loginDB = "postgres";
            String passwordDB = "54484413310";
            String url = "jdbc:postgresql://localhost:2002/students";
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
            HttpSession session = req.getSession();
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
