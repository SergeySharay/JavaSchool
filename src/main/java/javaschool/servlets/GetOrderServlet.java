package javaschool.servlets;


import javaschool.dao.OrdersDaoImpl;
import javaschool.entity.Client;
import javaschool.entity.Orders;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Date;

public class GetOrderServlet extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        OrdersDaoImpl ordersDao = new OrdersDaoImpl();
        HttpSession httpSession = req.getSession();
        Orders order = new Orders();
        Client client = (Client)httpSession.getAttribute("User");
        order.setClient(client);
        order.setPayment(req.getParameter("Rad1"));
        order.setDelivery(req.getParameter("Rad2"));
        order.setPaymentStatus("ќжидает оплаты");
        order.setOrderStatus(req.getParameter("Rad3"));
        order.setOrderDate(new Date());
        ordersDao.add(order);
        httpSession.setAttribute("Order",null);
        RequestDispatcher view = req.getRequestDispatcher("index.jsp");
        view.forward(req,resp);
    }
}