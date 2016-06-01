package javaschool.DAO;

import javaschool.entity.Product;

import javax.persistence.TypedQuery;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ProductDAOImpl extends GenericDaoHibernateImpl<Product,Long> implements ProductDAO {


    public ProductDAOImpl() {
        super(Product.class);
    }

    public List<Product> getProducts(){
        TypedQuery<Product> namedQuery = entityManager.createNamedQuery("Product.getProducts", Product.class);
        return namedQuery.getResultList();
    }

    public Set<String> getBrands(){
        TypedQuery<String> namedQuery = entityManager.createNamedQuery("Product.getBrands", String.class);
        return new HashSet<String>(namedQuery.getResultList());
    }

    public Set<String> getCollections(String brand){
        TypedQuery<String> namedQuery = entityManager.createNamedQuery("Product.getCollections", String.class);
        namedQuery.setParameter("brand",brand);
        return new HashSet<String>(namedQuery.getResultList());
    }
}
