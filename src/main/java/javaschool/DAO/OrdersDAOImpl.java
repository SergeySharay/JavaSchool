package javaschool.DAO;

import javaschool.entity.Client;
import javaschool.entity.Orders;

import javax.persistence.TypedQuery;
import java.util.List;

public class OrdersDAOImpl extends GenericDaoHibernateImpl<Orders,Long> implements OrdersDAO {

    public OrdersDAOImpl(){
        super(Orders.class);
    }

    public List<Orders> getOrders() {
        TypedQuery<Orders> namedQuery = entityManager.createNamedQuery("Orders.getOrders", Orders.class);
        return namedQuery.getResultList();
    }
    public List<Long> getClientOrders(Client client){
        TypedQuery<Long> namedQuery = entityManager.createNamedQuery("Orders.getClientOrders", Long.class);
        namedQuery.setParameter("client",client);
        return namedQuery.getResultList();
    }
}
