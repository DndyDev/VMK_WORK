package ru.vmk.ServletCookiesSession;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
@WebServlet("/user-servlet")
public class UserServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String password = req.getParameter("password");

        try {
             User user = UserDao.find(login);
            if( user != null){
                req.setAttribute("user", user);
                getServletContext().getRequestDispatcher("/loginSuccess.jsp").forward(req,resp);
            }else{
                PrintWriter out = resp.getWriter();
                out.println("wrong login or password");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}
