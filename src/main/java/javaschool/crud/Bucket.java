package javaschool.crud;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.LinkedHashMap;
import java.util.Map;

public class Bucket {
    private static Map<Long, Integer> order;

    public static void add(HttpServletRequest req, Long product) {
        HttpSession httpSession = req.getSession();

        if (httpSession.getAttribute("Order") == null) {
            order = new LinkedHashMap<Long, Integer>();
        } else {
            order = (Map<Long, Integer>) httpSession.getAttribute("Order");
        }

        if (order.containsKey(product)) {
            order.put((product), order.get(product) + 1);
        } else {
            order.put(product, 1);
        }
        httpSession.setAttribute("Order", order);
    }

    public void remove(HttpServletRequest req, Long product) {
        HttpSession httpSession = req.getSession();

        if (httpSession.getAttribute("Order") != null) {
            order = (Map<Long, Integer>) httpSession.getAttribute("Order");
            if (order.containsKey(product) && order.get(product) > 1) {
                order.put((product), order.get(product) - 1);
            } else {
                order.remove(product);
            }
        }


    }
}
