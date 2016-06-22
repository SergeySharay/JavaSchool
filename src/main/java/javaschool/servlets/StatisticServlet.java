package javaschool.servlets;

import javaschool.dao.OrderProductDaoImpl;
import javaschool.dao.OrdersDaoImpl;
import javaschool.entity.Client;
import javaschool.entity.OrderProduct;
import javaschool.entity.Orders;
import javaschool.entity.Product;
import org.apache.commons.lang3.time.DateUtils;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;

public class StatisticServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        OrderProductDaoImpl orderProductDao = new OrderProductDaoImpl();
        List<OrderProduct> orderProductList = orderProductDao.getOrderProducts();
        Map<Product, Long> productLongMap = new LinkedHashMap<Product, Long>();

        for (OrderProduct orderProduct : orderProductList) {
            if (productLongMap.containsKey(orderProduct.getProductId())) {
                productLongMap.put(orderProduct.getProductId(), productLongMap.get(orderProduct.getProductId()) + orderProduct.getQuantity());
            } else {
                productLongMap.put(orderProduct.getProductId(), orderProduct.getQuantity());
            }
        }

        Map<Product, Long> sortedMap = sortMap(productLongMap);
        Map<Product, Long> trimMap = trimMap(sortedMap);
        req.setAttribute("productLongMap", trimMap);

        OrdersDaoImpl ordersDao = new OrdersDaoImpl();
        List<Orders> ordersList = ordersDao.getOrders();
        Map<Client, Long> ordersLongMap = new LinkedHashMap<Client, Long>();

        for (Orders orders : ordersList) {
            if (ordersLongMap.containsKey(orders.getClient())) {
                ordersLongMap.put(orders.getClient(), (ordersLongMap.get(orders.getClient()) + 1L));
            } else {
                ordersLongMap.put(orders.getClient(), 1L);
            }
        }
        Map<Client, Long> sortedClientMap = sortClientMap(ordersLongMap);
        Map<Client, Long> trimedClientMap = trimClientMap(sortedClientMap);
        req.setAttribute("ordersLongMap", trimedClientMap);

        List<Orders> ordersListDate = new LinkedList<Orders>();
        List<Orders> ordersListDateMonth = new LinkedList<Orders>();
        for (Orders orders : ordersList) {

            if (orders.getOrderDate().compareTo(DateUtils.addWeeks(new Date(), -1)) > 0) {
                ordersListDate.add(orders);
            }
        }
        for (Orders orders : ordersList) {
            if (orders.getOrderDate().compareTo(DateUtils.addWeeks(new Date(), -4)) > 0) {
                ordersListDateMonth.add(orders);
            }
        }
        req.setAttribute("ordersListDate", ordersListDate);
        req.setAttribute("ordersListDateMonth", ordersListDateMonth);
        RequestDispatcher view = req.getRequestDispatcher("statistic.jsp");
        view.forward(req, resp);
    }

    private Map<Client, Long> trimClientMap(Map<Client, Long> sortedClientMap) {
        Map<Client, Long> trimedMap = new LinkedHashMap<Client, Long>();
        int i = 0;
        for (Iterator<Map.Entry<Client, Long>> it = sortedClientMap.entrySet().iterator(); it.hasNext() && i < 10; i++) {
            Map.Entry<Client, Long> entry = it.next();
            trimedMap.put(entry.getKey(), entry.getValue());
        }
        return trimedMap;

    }

    private Map<Product, Long> trimMap(Map<Product, Long> sortedMap) {
        Map<Product, Long> trimedMap = new LinkedHashMap<Product, Long>();
        int i = 0;
        for (Iterator<Map.Entry<Product, Long>> it = sortedMap.entrySet().iterator(); it.hasNext() && i < 10; i++) {
            Map.Entry<Product, Long> entry = it.next();
            trimedMap.put(entry.getKey(), entry.getValue());
        }
        return trimedMap;
    }

    private Map<Product, Long> sortMap(Map<Product, Long> productLongMap) {
        List<Map.Entry<Product, Long>> list = new LinkedList<Map.Entry<Product, Long>>(productLongMap.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Product, Long>>() {
            public int compare(Map.Entry<Product, Long> o1, Map.Entry<Product, Long> o2) {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });
        Map<Product, Long> sortedMap = new LinkedHashMap<Product, Long>();
        for (Iterator<Map.Entry<Product, Long>> it = list.iterator(); it.hasNext(); ) {
            Map.Entry<Product, Long> entry = it.next();
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMap;
    }

    private Map<Client, Long> sortClientMap(Map<Client, Long> productLongMap) {
        List<Map.Entry<Client, Long>> list = new LinkedList<Map.Entry<Client, Long>>(productLongMap.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Client, Long>>() {
            public int compare(Map.Entry<Client, Long> o1, Map.Entry<Client, Long> o2) {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });
        Map<Client, Long> sortedMap = new LinkedHashMap<Client, Long>();
        for (Iterator<Map.Entry<Client, Long>> it = list.iterator(); it.hasNext(); ) {
            Map.Entry<Client, Long> entry = it.next();
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMap;
    }
}
