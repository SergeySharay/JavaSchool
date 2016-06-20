/**
 * Dao class for ClientAdress entity.
 *
 * @author Sergey Sharay
 * @version 1.0
 */
package javaschool.dao;

import javaschool.entity.Client;
import javaschool.entity.ClientAdress;

import javax.persistence.TypedQuery;

public class ClientAdressDaoImpl extends GenericDaoImpl<ClientAdress, Long>
        implements ClientAdressDao {
    /**
     * Class constructor
     */
    public ClientAdressDaoImpl() {
        super(ClientAdress.class);
    }

    /**
     * @param client a Client entity
     * @return a ClientAdress entity
     */
    public ClientAdress getAdress(final Client client) {
        //EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
            entityManager.getTransaction().begin();
            TypedQuery<ClientAdress> namedQuery = entityManager.createNamedQuery("ClientAdress.getAdress", ClientAdress.class);
            namedQuery.setParameter("client", client);
            entityManager.getTransaction().commit();
            return namedQuery.getSingleResult();
        } finally {
            if (entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().rollback();
            }
            //entityManager.close();
        }

    }

    public void close() {
        entityManager.close();
    }
}
