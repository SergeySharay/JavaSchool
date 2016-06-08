package javaschool.servlets;

import javaschool.crud.CheckCookie;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.net.URLEncoder;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession httpSession = req.getSession();
        httpSession.setAttribute("CheckCookie", "false");
        String username = req.getParameter("user_name");
        String password = req.getParameter("pass_word");
        resp.addCookie(new Cookie("user_name", URLEncoder.encode(username, "utf-8")));
        resp.addCookie(new Cookie("pass_word", URLEncoder.encode(password, "utf-8")));
        CheckCookie.check(req);

        resp.sendRedirect("index.jsp");

        //RequestDispatcher view = req.getRequestDispatcher("index.jsp");
        //view.forward(req, resp);
    }
}
