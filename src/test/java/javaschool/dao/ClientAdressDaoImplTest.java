package javaschool.dao;

import javaschool.entity.Client;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import javax.persistence.EntityManager;

/**
 * Created by Sergey on 21.06.2016.
 */
public class ClientAdressDaoImplTest {
    ClientAdressDaoImpl clientAdressDao;
    private EntityManager entityManagerMock;

    @Before
    public void setUp() throws Exception {
        clientAdressDao = new ClientAdressDaoImpl();
        entityManagerMock = Mockito.mock(EntityManager.class);
    }

    @org.junit.Ignore
    @Test
    public void testGetAdress() throws Exception {
        Client client = new Client();
        client.setName("Vasya");
        clientAdressDao.getAdress(client);
    }
}