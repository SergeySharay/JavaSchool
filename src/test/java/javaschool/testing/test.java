package javaschool.testing;

import javaschool.dao.ClientDaoImpl;
import javaschool.dao.OrderProductDaoImpl;
import javaschool.dao.OrdersDaoImpl;
import javaschool.dao.ProductDaoImpl;
import javaschool.entity.ClientAdress;
import javaschool.entity.OrderProduct;
import javaschool.entity.Orders;
import javaschool.entity.Product;
import org.junit.Test;

public class test {

    ClientDaoImpl clientDAO = new ClientDaoImpl();
    OrdersDaoImpl ordersDAO = new OrdersDaoImpl();
    ProductDaoImpl productDAO = new ProductDaoImpl();
    OrderProductDaoImpl orderProductDAO = new OrderProductDaoImpl();
    @Test
    public void testSaveRecord() throws Exception {
/*
        //������� ������� ��� ������ � ��
        Client client1 = new Client();
        client1.setName("audi");
        client1.setSurname("tt");
        client1.setEmail("audi@tt.ru");
        client1.setBirthday(new Date());
        //�������� � ��
        Client client = ClientDaoImpl.add(client1);
        //������ ���������� � �� ������
        System.out.println(client1.getName() + client.getId());
        //clientDAO.get(client.getId());
            */
        //System.out.println(clientService.get((long) 2).getClientAdressSet());
        System.out.println("--------ordersDAO----------");
        System.out.println(ordersDAO.getOrders().size());

        for (Orders orders :ordersDAO.getOrders()){
            System.out.println("Order id= " + orders.getId());
           for(Product product : orders.getBucket())
            System.out.println("Product name= " + product.getName());
        }
        System.out.println("------------");
        System.out.println("client 1 " + clientDAO.get((long)1).getName());
        System.out.println("������ 1 �������" + ordersDAO.getClientOrders(clientDAO.get((long)1)));
        System.out.println("------------");

        for(OrderProduct orderProduct : orderProductDAO.getOrderProduct((long)2))
        System.out.println("id ��������� �� 2 ������ = " + orderProduct.getId());
        System.out.println("------------");
        System.out.println(productDAO.getProducts("aqua"));
    }

    public void testClientDAO() throws Exception {
        //������� ��������� �������
        System.out.println(clientDAO.get((long) 2).getClientAdressSet());
        //��� ������� ������ ������� �����
        for (ClientAdress clientAdress :clientDAO.get((long) 2).getClientAdressSet()){
            System.out.println(clientAdress.getCity());
        }
        //������� ������ ��� 1 �������
        System.out.println(clientDAO.get((long)2).getOrders());
        //������� ��� �� ������ ������
        for (Orders orders :clientDAO.get((long) 2).getOrders()){
            System.out.println(orders.getClient().getName());
        }
    }
}

