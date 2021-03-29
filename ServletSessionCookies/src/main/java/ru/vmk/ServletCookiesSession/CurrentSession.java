package ru.vmk.ServletCookiesSession;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class CurrentSession {
    public static void getSession(HttpServletResponse resp, HttpServletRequest req) {
        try{
            HttpSession session = req.getSession(true);
            PrintWriter out = resp.getWriter();
            out.write("My session counter: ");
            out.write(String.valueOf(prepareSessionCounter(session)));
            out.write("<br>Creation Time: " + new Date(session.getCreationTime()));
            out.write("<br>Time last access: " + new Date(session.getLastAccessedTime()));
            out.write("<br>session ID: " + session.getId());
            int timeLive = 60 * 30;
            session.setMaxInactiveInterval(timeLive);
            out.write("<br> Set max inactive interval: " + timeLive + "sec");
            out.flush();
            out.close();
        }catch (IOException e){
            e.printStackTrace();
            throw new RuntimeException("Failed : " + e);
        }
    }
    private static int prepareSessionCounter (HttpSession session){
        Integer counter = (Integer) session.getAttribute("counter");
        if (counter == null){
            session.setAttribute("counter",1);
            return 1;
        }else{
            counter++;
            session.setAttribute("counter",counter);
            return counter;
        }
    }
}
