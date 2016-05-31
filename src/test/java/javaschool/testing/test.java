package javaschool.testing;
import javaschool.DAO.*;
import javaschool.crud.ClientService;
import javaschool.entity.Client;
import javaschool.entity.ClientAdress;
import javaschool.entity.Product;
import org.junit.Test;

import java.util.Date;

public class test {

    //GenericDaoHibernateImpl<Client,Long> genericDaoHibernate = new GenericDaoHibernateImpl<Client,Long>(Client.class);
    //GenericDaoHibernateImpl<Product,Long> productgenericDaoHibernate = new GenericDaoHibernateImpl<Product,Long>(Product.class);
    //ProductDAOImpl productDAO = new ProductDAOImpl();
    ClientDAOImpl clientDAO = new ClientDAOImpl();
    //ClientService clientService = new ClientService();
    @Test
    public void testSaveRecord() throws Exception {
/*
        //Создаем клиента для записи в БД
        Client client1 = new Client();
        client1.setName("audi");
        client1.setSurname("tt");
        client1.setEmail("audi@tt.ru");
        client1.setBirthday(new Date());
        //Записали в БД
        Client client = ClientDAOImpl.add(client1);
        //Вывели записанную в БД запись
        System.out.println(client1.getName() + client.getId());
        //clientDAO.get(client.getId());
            */
        //System.out.println(clientService.get((long) 2).getClientAdressSet());
        System.out.println(clientDAO.get((long) 2).getClientAdressSet());

        for (ClientAdress clientAdress :clientDAO.get((long) 2).getClientAdressSet()){
            System.out.println(clientAdress.getCity());
        }
      //  System.out.println(productDAO.getBrands());
       // System.out.println(productDAO.getCollections("Venis"));
        // System.out.println(productDAO.getProducts());





    }}

