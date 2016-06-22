package javaschool.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;


public class LogoutServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session = req.getSession();

        resp.addCookie(new Cookie("user_name", ""));
        resp.addCookie(new Cookie("pass_word", ""));
        session.removeAttribute("CheckCookie");
        session.removeAttribute("User");
        session.removeAttribute("clientAdress");
        resp.sendRedirect("index.jsp");
    }
}
