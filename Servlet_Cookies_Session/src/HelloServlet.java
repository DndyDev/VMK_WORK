import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    HttpSession session = request.getSession();
    String name = (String) session.getAttribute("username");

        PrintWriter out = response.getWriter();
        try {
            if(name == null){
                session.setAttribute("name","Tom");
                out.println("Session data are set");
            }else {
                out.println("Name " + name);
                session.removeAttribute("name");

            }
        }finally {
            out.close();
        }
    }
}
