package javaschool.testing;
import javaschool.crud.ClientService;
import javaschool.crud.ProductService;
import javaschool.entity.Client;
import javaschool.entity.Product;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class test {

    ClientService service = new ClientService();
    ProductService productService = new ProductService();
    @Test
    public void testSaveRecord() throws Exception {
        //������� ���������� ��� ������ � ��
        Client client1 = new Client();
        client1.setName("audi");
        client1.setEmail("audi@audi.ru");
        client1.setBirthday(new Date());
        //�������� � ��
        Client client = service.add(client1);
        //������ ���������� � �� ������

        System.out.println("audi"+client.getId() +" " + client1.getId());
    }
    @Test
    public void testSelect() throws Exception {
        List<Product> products = productService.getAll();
        //������� ��������� ������ ����
        for(Product c : products){
        System.out.println(c);
           }}}
