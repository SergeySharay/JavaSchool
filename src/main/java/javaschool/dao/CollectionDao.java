/**
 * @author Sergey Sharay
 * @version 1.0
 */
package javaschool.dao;

import javaschool.entity.Collection;

/**
 * @deprecated Dao interface for Collection entity.
 */
public interface CollectionDao extends GenericDao<Collection, Long> {

    String getCollectionImage(String brand, String collection);
}