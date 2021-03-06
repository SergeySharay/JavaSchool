package javaschool.DAO;

import javaschool.entity.Client;
import java.util.List;

public interface ClientDAO extends GenericDAO<Client,Long>
{
    List<Client> getClients();
}
