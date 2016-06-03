package javaschool.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");

        String username = req.getParameter("user_name");
        String password = req.getParameter("pass_word");

        resp.addCookie(new Cookie("user_name", username));
        resp.addCookie(new Cookie("pass_word", password));
        resp.sendRedirect("index.jsp");
        //RequestDispatcher view = req.getRequestDispatcher("index.jsp");
        //view.forward(req, resp);
    }
}
