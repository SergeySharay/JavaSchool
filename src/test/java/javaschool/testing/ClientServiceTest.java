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
        //������� ���������� ��� ������ � ��
        Client client1 = new Client();
        client1.setName("audi");
        client1.setEmail("audi@audi.ru");
        client1.setBirthday(new Date());
        //�������� � ��
        Client client = service.add(client1);
        //������ ���������� � �� ������
        System.out.println("audi"+client);
    }

    @Test
    public void testDeleteRecord() throws Exception {
        //������� ���������� ��� ������ � ��
        Client client1 = new Client();
        client1.setName("Ferrari");
        client1.setEmail("ferrari@ferrari.ru");
        client1.setBirthday(new Date());

        //�������� ��� � ��
        Client client = service.add(client1);

        //������ ��� � ��
        service.delete(client.getId());
    }

    @Test
    public void testSelect() throws Exception {
        //������� ���������� ��� ������ � ��
        Client client1 = new Client();
        client1.setName("Citroen?");
        client1.setEmail("30000");
        client1.setBirthday(new Date());

        //���������� � ��
        Client client = service.add(client1);

        //�������� � �� Citroen?
        Client clientFromDB = service.get(client.getId());
        System.out.println(clientFromDB);
    }

    @Test
    public void testUpdate() throws Exception {
        //������� ���������� ��� ������ � ��
        Client client1 = new Client();
        client1.setName("Lambordshini");
        client1.setEmail("5000000");
        client1.setBirthday(new Date());
        //���������� � ��
        client1 = service.add(client1);
        client1.setName("olololo");
        //���������
        service.update(client1);
        //�������� ���������� ������
        Client client2 = service.get(client1.getId());
        System.out.println(client2);
    }

    public void testGetAll(){
        //������� ���������� ��� ������ � ��
        Client client1 = new Client();
        client1.setName("Lexus");
        client1.setEmail("300000");
        client1.setBirthday(new Date());

        //������� ���������� ��� ������ � ��
        Client client2 = new Client();
        client2.setName("Fiat");
        client2.setEmail("20000");
        client2.setBirthday(new Date());

        //������� ���������� ��� ������ � ��
        Client client3 = new Client();
        client3.setName("Porsche");
        client3.setEmail("458000");
        client3.setBirthday(new Date());

        //��������� ��� ����
        service.add(client1);
        service.add(client2);
        service.add(client3);

        //�������� ��� ���� � ��
        List<Client> clients = service.getAll();

        //������� ��������� ������ ����
        for(Client c : clients){
            System.out.println(c);
        }
    }

}
