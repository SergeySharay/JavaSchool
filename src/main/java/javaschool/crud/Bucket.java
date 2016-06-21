/**
 *
 * @author Sergey Sharay
 * @version 1.0
 */
package javaschool.crud;

import org.apache.log4j.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Class for adding products to the bucket
 */
public class Bucket {
    private static Map<Long, Integer> order;
    private static Logger logger = Logger.getLogger(Bucket.class);
    /**
     * If Bucket is empty method create new Map(Long, Integer) where
     * Long - product id,
     * Integer - quantity of current product,
     * If Bucket is not empty, method increases quantity current product by 1.
     *
     * @param product Product Id for adding to the bucket
     * @param req     request from page
     */
    public static void add(final HttpServletRequest req, final Long product) {
        HttpSession httpSession = req.getSession();
        logger.debug("Inside Bucket.add()");
        if (httpSession.getAttribute("Order") == null) {
            order = new LinkedHashMap<Long, Integer>();
            logger.info("new LinkedHashMap<Long, Integer>()");
        } else {
            try{
            order = (Map<Long, Integer>) httpSession.getAttribute("Order");
            logger.info("LinkedHashMap<Long, Integer>()from httpSession");
            }catch (Exception e){
                logger.error(e);
                e.printStackTrace();
            }
        }

        if (order.containsKey(product)) {
            order.put((product), order.get(product) + 1);
            logger.info("increase quantity by 1");
        } else {
            order.put(product, 1);
            logger.info("create new product");
        }
        httpSession.setAttribute("Order", order);
        logger.info("set httpSession.setAttribute(Order)");
    }

}
