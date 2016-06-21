package javaschool.servlets;

import javaschool.dao.OrderProductDaoImpl;
import javaschool.dao.OrdersDaoImpl;
import javaschool.entity.OrderProduct;
import javaschool.entity.Orders;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class RepeatServlet extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        Map<Long, Integer> order;
        HttpSession httpSession = req.getSession();
        OrderProductDaoImpl orderProductDao = new OrderProductDaoImpl();
        OrdersDaoImpl ordersDao = new OrdersDaoImpl();
        Orders orders = ordersDao.get(Long.parseLong(req.getParameter("orderId")));
        List<OrderProduct> orderProductList =
                new LinkedList<>(orderProductDao.getOrderProduct(orders));

        if (httpSession.getAttribute("Order") == null) {
            order = new LinkedHashMap<Long, Integer>();
        } else {
            order = (Map<Long, Integer>) httpSession.getAttribute("Order");
        }

        for (OrderProduct orderProduct : orderProductList) {
            if (order.containsKey(orderProduct.getProductId().getId())) {
                order.put(
                        orderProduct.getProductId().getId(),
                        orderProduct.getQuantity().intValue()
                );
            } else {
                order.put(orderProduct.getProductId().getId(),
                        orderProduct.getQuantity().intValue()
                );
            }
        }
        httpSession.setAttribute("Order", order);
        RequestDispatcher view = req.getRequestDispatcher("bucket.jsp");
        view.forward(req, resp);
    }
}