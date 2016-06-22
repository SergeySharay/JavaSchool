package javaschool.testing;

import javaschool.crud.Bucket;
import javaschool.dao.ClientAdressDaoImpl;
import javaschool.dao.GenericDaoImpl;
import javaschool.entity.Client;
import javaschool.entity.ClientAdress;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

public class test {
    private static Logger logger = Logger.getLogger(test.class);
    @Mock
    private ClientAdressDaoImpl mockClientAdressDaoImpl;
    @Mock
    private GenericDaoImpl mockGenericDaoImpl;
    @Spy
    private ClientAdressDaoImpl spyClientAdressDaoImpl;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void mockCreation() {
        Bucket bucket = Mockito.mock(Bucket.class);
    }

    @Test
    public void spyCreation() {
        Bucket bucket = Mockito.spy(new Bucket());
    }
    @org.junit.Ignore
    @Test
    public void testClientAdressDaoImpl() {

        ClientAdressDaoImpl clientAdressDao = new ClientAdressDaoImpl();
        ClientAdress clientAdress = new ClientAdress();
        Client client = new Client();
        Mockito.when(mockGenericDaoImpl.add(client)).thenReturn(new Object());
        //Mockito.when(mockClientAdressDaoImpl.getAdress(client)).thenReturn(clientAdress);
        //mockClientAdressDaoImpl.getAdress(new Client());
        mockGenericDaoImpl.add(client);
    }

}

