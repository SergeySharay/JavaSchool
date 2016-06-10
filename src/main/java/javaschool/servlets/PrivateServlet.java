package javaschool.servlets;

import javaschool.dao.ClientDaoImpl;
import javaschool.entity.Client;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class PrivateServlet extends HttpServlet {
        public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        }

        public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        HttpSession httpSession = req.getSession();
        DateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        ClientDaoImpl clientDao = new ClientDaoImpl();

        Client client = ((Client) httpSession.getAttribute("User"));

        if (!req.getParameter("firstName").equals("")) {
            client.setName(req.getParameter("firstName"));
        }
        if (!req.getParameter("lastName").equals("")) {
            client.setSurname(req.getParameter("lastName"));
        }
        if (!req.getParameter("email").equals("")) {
            client.setEmail(req.getParameter("email"));
        }
        if (!req.getParameter("pass").equals("")) {
            client.setPassword(req.getParameter("pass"));
        }
        if (!req.getParameter("date").equals("")) {
            try {
                client.setBirthday(format.parse(req.getParameter("date")));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        clientDao.update(client);
            resp.sendRedirect("Cabinet");
    }
}
