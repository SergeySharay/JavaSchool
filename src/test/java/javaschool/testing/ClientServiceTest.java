package javaschool.testing;
import javaschool.crud.ClientService;
import javaschool.entity.Client;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ClientServiceTest {

    ClientService service = new ClientService();

    @Test
    public void testSaveRecord() throws Exception {
        //Создаем автомобиль для записи в БД
        Client client1 = new Client();
        client1.setName("audi");
        client1.setEmail("audi@audi.ru");
        client1.setBirthday(new Date());
        //Записали в БД
        Client client = service.add(client1);
        //Вывели записанную в БД запись
        System.out.println("audi"+client);
    }

    @Test
    public void testDeleteRecord() throws Exception {
        //Создаем автомобиль для записи в БД
        Client client1 = new Client();
        client1.setName("Ferrari");
        client1.setEmail("ferrari@ferrari.ru");
        client1.setBirthday(new Date());

        //Записуем его в БД
        Client client = service.add(client1);

        //Удвлем его с БД
        service.delete(client.getId());
    }

    @Test
    public void testSelect() throws Exception {
        //Создаем автомобиль для записи в БД
        Client client1 = new Client();
        client1.setName("Citroen?");
        client1.setEmail("30000");
        client1.setBirthday(new Date());

        //Записываем в БД
        Client client = service.add(client1);

        //Получние с БД Citroen?
        Client clientFromDB = service.get(client.getId());
        System.out.println(clientFromDB);
    }

    @Test
    public void testUpdate() throws Exception {
        //Создаем автомобиль для записи в БД
        Client client1 = new Client();
        client1.setName("Lambordshini");
        client1.setEmail("5000000");
        client1.setBirthday(new Date());
        //Записываем в БД
        client1 = service.add(client1);
        client1.setName("olololo");
        //Обновляем
        service.update(client1);
        //Получаем обновленую запись
        Client client2 = service.get(client1.getId());
        System.out.println(client2);
    }

    public void testGetAll(){
        //Создаем автомобиль для записи в БД
        Client client1 = new Client();
        client1.setName("Lexus");
        client1.setEmail("300000");
        client1.setBirthday(new Date());

        //Создаем автомобиль для записи в БД
        Client client2 = new Client();
        client2.setName("Fiat");
        client2.setEmail("20000");
        client2.setBirthday(new Date());

        //Создаем автомобиль для записи в БД
        Client client3 = new Client();
        client3.setName("Porsche");
        client3.setEmail("458000");
        client3.setBirthday(new Date());

        //Сохраняем все авто
        service.add(client1);
        service.add(client2);
        service.add(client3);

        //Получаем все авто с БД
        List<Client> clients = service.getAll();

        //Выводим полученый список авто
        for(Client c : clients){
            System.out.println(c);
        }
    }

}
