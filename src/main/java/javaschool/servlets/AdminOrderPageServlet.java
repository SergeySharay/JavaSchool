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

public class AdminOrderPageServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession httpSession = req.getSession();
        OrdersDaoImpl ordersDao = new OrdersDaoImpl();
        Orders order = ordersDao.get(Long.parseLong(req.getParameter("orderId")));
        httpSession.setAttribute("orderPage",order);
        RequestDispatcher view = req.getRequestDispatcher("adminorderpage.jsp");
        view.forward(req, resp);
    }
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        HttpSession httpSession = req.getSession();
        OrdersDaoImpl ordersDao = new OrdersDaoImpl();
        Orders order = ordersDao.get(Long.parseLong(req.getParameter("orderId")));


        if (!req.getParameter("payment").equals("")) {
            order.setPayment(req.getParameter("payment"));
        }
        if (!req.getParameter("delivery").equals("")) {
            order.setDelivery(req.getParameter("delivery"));
        }
        if (!req.getParameter("pamentstatus").equals("")) {
            order.setPaymentStatus(req.getParameter("pamentstatus"));
        }
        if (!req.getParameter("orderstatus").equals("")) {
            order.setOrderStatus(req.getParameter("orderstatus"));
        }
        ordersDao.update(order);
        httpSession.setAttribute("orderPage",order);
        RequestDispatcher view = req.getRequestDispatcher("adminorderpage.jsp");
        view.forward(req, resp);
    }
}