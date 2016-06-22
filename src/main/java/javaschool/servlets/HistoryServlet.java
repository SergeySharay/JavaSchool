package javaschool.servlets;

import javaschool.dao.ClientDaoImpl;
import javaschool.entity.Client;
import javaschool.entity.Orders;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Set;

public class HistoryServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession httpSession = req.getSession();
        Client client = (Client) httpSession.getAttribute("User");
        ClientDaoImpl clientDao = new ClientDaoImpl();
        Set<Orders> ordersSet = clientDao.getOrders(client);
        httpSession.setAttribute("OrdersSet", ordersSet);
        RequestDispatcher view = req.getRequestDispatcher("orders.jsp");
        view.forward(req, resp);
    }
}
