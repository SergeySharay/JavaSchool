package javaschool.DAO;


import javaschool.entity.Client;
import javax.persistence.TypedQuery;
import java.util.List;

public class ClientDAOImpl extends GenericDaoHibernateImpl<Client,Long> implements ClientDAO {

    public List<Client> getClients(){
        TypedQuery<Client> namedQuery = entityManager.createNamedQuery("Client.getClients", Client.class);
        return namedQuery.getResultList();
    }
    public Client get(Long id){
        return (Client)entityManager.find(Client.class, id);
    }
}
