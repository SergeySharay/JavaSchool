package javaschool.crud;

import javaschool.entity.Client;
import javaschool.entity.Product;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.*;


public class ProductService {
    public EntityManager em = Persistence.createEntityManagerFactory("clients").createEntityManager();

    public Product add(Product product){
        em.getTransaction().begin();
        Product productFromDB = em.merge(product);
        em.getTransaction().commit();
        return productFromDB;
    }
    public void delete(long id){
        em.getTransaction().begin();
        em.remove(get(id));
        em.getTransaction().commit();
    }
    public Product get(long id){
        return em.find(Product.class, id);
    }
    public void update(Product product){
        em.getTransaction().begin();
        em.merge(product);
        em.getTransaction().commit();
    }

    public List<Product> getProducts(){
        TypedQuery<Product> namedQuery = em.createNamedQuery("Product.getProducts", Product.class);
        return namedQuery.getResultList();
    }

    public Set<String> getBrands(){
        TypedQuery<String> namedQuery = em.createNamedQuery("Product.getBrands", String.class);
        return new HashSet<String>(namedQuery.getResultList());
    }

    public Set<String> getCollections(String brand){
        TypedQuery<String> namedQuery = em.createNamedQuery("Product.getCollections", String.class);
        namedQuery.setParameter("brand",brand);
        return new HashSet<String>(namedQuery.getResultList());
    }

}
