package javaschool.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class LogoutServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.addCookie(new Cookie("user_name",""));
        resp.addCookie(new Cookie("pass_word",""));
        resp.sendRedirect("index.jsp");
        //RequestDispatcher view = req.getRequestDispatcher("index.jsp");
        //view.forward(req, resp);
    }}
