package javaschool.DAO;

import javaschool.entity.Product;
import java.util.List;
import java.util.Set;

public interface ProductDAO extends GenericDAO<Product,Long>
{
    List<Product> getProducts();
    Set<String> getBrands();
    Set<String> getCollections(String brand);
}