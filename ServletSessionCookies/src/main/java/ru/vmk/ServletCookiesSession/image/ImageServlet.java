package ru.vmk.ServletCookiesSession.image;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ImageServlet", value = "/ImageServlet")
public class ImageServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String captcha = request.getParameter(Namespace.captcha);
        System.out.println("captcha=" + captcha);
        try (PrintWriter out = response.getWriter()) {
            out.printf("<html>"+
                            "<head>"+
                            "<title>Graphics</title>"+
                                "<meta charset=utf-8 lang=en>"+
                            "</head>"+
                            "<body>" +
                                "<form action=ImageServlet>" +
                                    "<img src=\"CaptchaImageServlet%s\">" +
                                   "<input type=text name=captcha placeholder=captcha><br/>" +
                                    "<input type='submit' value='Generate' />" +
                                "</form>" +
                            "</body>" +
                    "</html>"
                    , (captcha == null) ? "" : (captcha.isEmpty()) ? "" : "?" + request.getQueryString());
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
}
