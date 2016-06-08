package javaschool.dao;

import javaschool.entity.Client;
import javaschool.entity.ClientAdress;

import javax.persistence.TypedQuery;

public class ClientAdressDaoImpl extends GenericDaoImpl<ClientAdress,Long> implements ClientAdressDao {
    public ClientAdressDaoImpl(){
        super(ClientAdress.class);
    }

    public ClientAdress getAdress(Client client) {
        TypedQuery<ClientAdress> namedQuery = entityManager.createNamedQuery("ClientAdress.getAdress", ClientAdress.class);
        namedQuery.setParameter("client",client);
        return namedQuery.getSingleResult();
    }
}
