package javaschool.servlets;

import javaschool.dao.OrdersDaoImpl;
import javaschool.entity.Orders;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

public class AdminOrdersServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession httpSession = req.getSession();
        OrdersDaoImpl ordersDao = new OrdersDaoImpl();
        List<Orders> ordersList = ordersDao.getOrders();
        httpSession.setAttribute("ordersList", ordersList);
        RequestDispatcher view = req.getRequestDispatcher("adminorders.jsp");
        view.forward(req, resp);
    }
}