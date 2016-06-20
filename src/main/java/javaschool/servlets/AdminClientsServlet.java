package javaschool.servlets;

import javaschool.dao.ClientDaoImpl;
import javaschool.entity.Client;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

public class AdminClientsServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession httpSession = req.getSession();
        ClientDaoImpl clientDao = new ClientDaoImpl();
        List<Client> clientList = clientDao.getClients();
        httpSession.setAttribute("clientList", clientList);
        RequestDispatcher view = req.getRequestDispatcher("adminclients.jsp");
        view.forward(req, resp);
    }

    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ClientDaoImpl clientDao = new ClientDaoImpl();
        Client client = clientDao.get(Long.parseLong(req.getParameter("clientId")));
        if (client.getPermission() == 1) {
            client.setPermission(2);
        } else {
            client.setPermission(1);
        }
        clientDao.update(client);
        resp.sendRedirect("AdminClients");
    }
}