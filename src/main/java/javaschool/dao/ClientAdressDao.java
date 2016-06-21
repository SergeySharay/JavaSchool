/**
 * @author Sergey Sharay
 * @version 1.0
 */
package javaschool.dao;

import javaschool.entity.Client;
import javaschool.entity.ClientAdress;
/**
 * Dao interface for ClientAdress entity.
 */
public interface ClientAdressDao extends GenericDao<ClientAdress, Long> {
    /**
     * @param client a Client entity
     * @return a ClientAdress entity
     */
    ClientAdress getAdress(Client client);
}
