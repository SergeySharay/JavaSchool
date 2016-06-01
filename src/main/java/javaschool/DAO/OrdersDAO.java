package javaschool.DAO;
import javaschool.entity.Orders;

import java.util.List;

public interface OrdersDAO extends GenericDAO<Orders,Long> {
    List<Orders> getOrders();
}
