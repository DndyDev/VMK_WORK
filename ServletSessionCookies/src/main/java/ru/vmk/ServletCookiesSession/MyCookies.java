package ru.vmk.ServletCookiesSession;


import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MyCookies extends HttpServlet {
    private static int index = 0;
    public static void getCookies(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        Cookie[] cookies = req.getCookies();
        if (cookies != null){
            out.print("Number cookies: " + cookies.length + "<br/>");
            for (int i = 0; i < cookies.length; i++){
                Cookie cookie = cookies[i];
                out.print("Secure :" + cookie.getSecure() + "<br/>");

            }
        }
        out.write("My Cookie counter: ");
        out.write(String.valueOf(prepareCookieCounter(req,resp)));
        out.print("<form action=\"\" type=\"get\"> <input type=\"submit\" />   </form>");
        out.close();
    }

    public static void seCookie(HttpServletRequest req, HttpServletResponse resp){
        String key = "key" + index;
        String value = "value" + index;
        Cookie cookie = new Cookie(key,value);
        cookie.setMaxAge(3600);
        resp.addCookie(cookie);
        index++;
    }
    private static int prepareCookieCounter(HttpServletRequest request,
                                            HttpServletResponse response) {
        Cookie[] cookies = request.getCookies();
        Cookie counterCookie;
        if (cookies != null) {
            for (int i = 0; i < cookies.length; i++) {
                if ("counter".equals(cookies[i].getName())) {
                    String counterStr = cookies[i].getValue();
                    int counterValue;
                    try {
                        counterValue = Integer.parseInt(counterStr);
                    } catch (NumberFormatException e) {
                        counterValue = 0;
                    }
                    counterValue++;
                    counterCookie = new Cookie("counter", String.valueOf(counterValue));
                    counterCookie.setMaxAge(3600);
                    response.addCookie(counterCookie);
                    return counterValue;
                }}
        }
        counterCookie = new Cookie("counter", "1");
        counterCookie.setMaxAge(3600);
        response.addCookie(counterCookie);
        return 1;
    }

}
