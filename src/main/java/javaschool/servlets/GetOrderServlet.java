package javaschool.servlets;


import javaschool.dao.OrderProductDaoImpl;
import javaschool.dao.OrdersDaoImpl;
import javaschool.dao.ProductDaoImpl;
import javaschool.entity.Client;
import javaschool.entity.OrderProduct;
import javaschool.entity.Orders;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Date;
import java.util.Map;

public class GetOrderServlet extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        OrdersDaoImpl ordersDao = new OrdersDaoImpl();
        HttpSession httpSession = req.getSession();
        OrderProductDaoImpl orderProductDao = new OrderProductDaoImpl();
        ProductDaoImpl productDao = new ProductDaoImpl();
        Orders order = new Orders();
        Client client = (Client) httpSession.getAttribute("User");
        order.setClient(client);
        order.setPayment(req.getParameter("Rad1"));
        order.setDelivery(req.getParameter("Rad2"));
        order.setPaymentStatus("������� ������");
        order.setOrderStatus(req.getParameter("Rad3"));
        order.setOrderDate(new Date());
        Orders orderFromD = ordersDao.add(order);

        for (Map.Entry entry : ((Map<Long, Integer>) httpSession.getAttribute("Order")).entrySet()) {
            OrderProduct orderProduct = new OrderProduct();
            orderProduct.setOrderId(orderFromD);
            orderProduct.setProductId(productDao.get((Long) entry.getKey()));
            orderProduct.setQuantity(new Long((Integer) entry.getValue()));
            orderProductDao.add(orderProduct);
        }
        httpSession.setAttribute("Order", null);
        RequestDispatcher view = req.getRequestDispatcher("index.jsp");
        view.forward(req, resp);
    }
}