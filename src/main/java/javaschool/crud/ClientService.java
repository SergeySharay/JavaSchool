package javaschool.crud;

import javaschool.entity.Client;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class ClientService {
    public EntityManager em = Persistence.createEntityManagerFactory("clients").createEntityManager();

    public Client add(Client client){
        em.getTransaction().begin();
        Client carFromDB = em.merge(client);
        em.getTransaction().commit();
        return carFromDB;
    }

    public void delete(long id){
        em.getTransaction().begin();
        em.remove(get(id));
        em.getTransaction().commit();
    }

    public Client get(long id){
        return em.find(Client.class, id);
    }

    public void update(Client client){
        em.getTransaction().begin();
        em.merge(client);
        em.getTransaction().commit();
    }

    public List<Client> getAll(){
        TypedQuery<Client> namedQuery = em.createNamedQuery("Client.getAll", Client.class);
        return namedQuery.getResultList();
    }

}
