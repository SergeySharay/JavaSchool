/**
 * A class for adding products to the bucket.
 *
 * @author Sergey Sharay
 * @version 1.0
 */
package javaschool.crud;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Class for adding products to the bucket
 */
public class Bucket {
    private static Map<Long, Integer> order;

    /**
     * If Bucket is empty method create new Map<Long, Integer>, where
     * Long - product id,
     * Integer - quantity of current product.
     * If Bucket is not empty, method increases quantity current product by 1.
     *
     * @param product Product Id for adding to the bucket
     * @param req     request from page
     */
    public static void add(final HttpServletRequest req, final Long product) {
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

   /* public static void remove(final HttpServletRequest req, final Long product) {
        HttpSession httpSession = req.getSession();

        if (httpSession.getAttribute("Order") != null) {
            order = (Map<Long, Integer>) httpSession.getAttribute("Order");
            if (order.containsKey(product) && order.get(product) > 1) {
                order.put((product), order.get(product) - 1);
            } else {
                order.remove(product);
            }
        }


    }*/
}
