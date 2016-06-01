package javaschool.DAO;
import javaschool.entity.OrderProduct;

import java.util.List;

public interface OrderProductDAO extends GenericDAO<OrderProduct,Long> {
    List<OrderProduct> getOrderProduct(Long id);
}
