package javaschool.DAO;

import javaschool.entity.OrderProduct;
import javaschool.entity.Orders;

import javax.persistence.TypedQuery;
import java.util.List;

public class OrderProductDAOImpl extends GenericDaoHibernateImpl<OrderProduct,Long> implements OrderProductDAO {

        public OrderProductDAOImpl(){
            super(OrderProduct.class);
        }

        public List<OrderProduct> getOrderProduct(Long id) {
            TypedQuery<OrderProduct> namedQuery = entityManager.createNamedQuery("OrderProduct.getOrderProducts", OrderProduct.class);
            namedQuery.setParameter("order", id);
            return namedQuery.getResultList();
           }
}
