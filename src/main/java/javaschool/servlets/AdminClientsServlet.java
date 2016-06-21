package javaschool.servlets;

import javaschool.dao.ClientDaoImpl;
import javaschool.entity.Client;
import org.apache.log4j.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

public class AdminClientsServlet extends HttpServlet {
    private static Logger logger = Logger.getLogger(AdminClientsServlet.class);
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("Call AdminClientsServlet doGet method");
        logger.info("Call req.getSession() method");
        HttpSession httpSession = req.getSession();
        logger.info("Initializing new ClientDaoImpl()");
        ClientDaoImpl clientDao = new ClientDaoImpl();
        logger.info("Get clientDao.getClients()");
        List<Client> clientList = clientDao.getClients();
        logger.info("Set ${clientList} = (clientList) to httpSession");
        httpSession.setAttribute("clientList", clientList);
        logger.info("Call getRequestDispatcher(adminclients.jsp) method");
        RequestDispatcher view = req.getRequestDispatcher("adminclients.jsp");
        view.forward(req, resp);
    }

    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("Call AdminClientsServlet doPost method");
        logger.info("Initializing new ClientDaoImpl()");
        ClientDaoImpl clientDao = new ClientDaoImpl();
        logger.info("Get client from DB");
        Client client = clientDao.get(Long.parseLong(req.getParameter("clientId")));
        if (client.getPermission() == 1) {
            client.setPermission(2);
            logger.info("Set client permission to 2");
        } else {
            client.setPermission(1);
            logger.info("Set client permission to 1");
        }
        clientDao.update(client);
        logger.info("sendRedirect to AdminClients");
        resp.sendRedirect("AdminClients");
    }
}