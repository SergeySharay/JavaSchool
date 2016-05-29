package javaschool.testing;
import javaschool.crud.ClientService;
import javaschool.crud.ProductService;
import javaschool.entity.Client;
import javaschool.entity.Product;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import java.util.*;


public class main {
    ProductService productService = new ProductService();
    @Test
    public void testSelect() throws Exception {
        List<Product> products = productService.getAll();
        Set <String> products2 = productService.brandGetAll();
        //Выводим полученый список
        for(String c : products2){
            System.out.println(c);
        }
        System.out.println("---------");
       // for(Product c : products){
        //    System.out.println(c);
       // }
}
}

