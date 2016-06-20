package javaschool.dao;

import javaschool.entity.Client;
import javaschool.entity.ClientAdress;

public interface ClientAdressDao extends GenericDao<ClientAdress, Long> {
    ClientAdress getAdress(Client client);
}
