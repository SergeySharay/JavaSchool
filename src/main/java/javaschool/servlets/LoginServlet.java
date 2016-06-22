package javaschool.servlets;

import javaschool.dao.ClientAdressDaoImpl;
import javaschool.dao.ClientDaoImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.net.URLEncoder;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Map;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession httpSession = req.getSession();
        ClientDaoImpl clientDao = new ClientDaoImpl();
        ClientAdressDaoImpl clientAdressDao = new ClientAdressDaoImpl();
        DateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        String username = req.getParameter("user_name");
        String password = req.getParameter("pass_word");
        resp.addCookie(new Cookie("user_name", URLEncoder.encode(username, "utf-8")));
        resp.addCookie(new Cookie("pass_word", URLEncoder.encode(password, "utf-8")));
        Map<String, String> userpass = clientDao.getClientEmailPassword();
        if (userpass.containsKey(username) && userpass.get(username).equals(password)) {

            httpSession.setAttribute("format", format);
            httpSession.setAttribute("CheckCookie", "true");
            httpSession.setAttribute("User", clientDao.getClient(username));
            httpSession.setAttribute("clientAdress", clientAdressDao.getAdress(clientDao.getClient(username)));
            req.setAttribute("checkac", "true");
            resp.sendRedirect("index.jsp");
        } else {
            req.setAttribute("checkac", "false");
            RequestDispatcher view = req.getRequestDispatcher("login.jsp");
            view.forward(req, resp);
        }
    }
}
