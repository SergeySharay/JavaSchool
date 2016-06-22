/**
 * @author Sergey Sharay
 * @version 1.0
 */
package javaschool.dao;


import javaschool.entity.Collection;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 * @deprecated
 */
public class CollectionDaoImpl extends GenericDaoImpl<Collection, Long> implements CollectionDao {
    public CollectionDaoImpl() {
        super(Collection.class);
    }

    public String getCollectionImage(final String brand, final String collection) {
        EntityManager entityManager = getEntityManager();
        try {
            entityManager.getTransaction().begin();
            TypedQuery<Collection> namedQuery = entityManager.createNamedQuery("Collection.getCollectionOfBrand", Collection.class);
            namedQuery.setParameter("brand", brand);
            namedQuery.setParameter("collection", collection);
            entityManager.getTransaction().commit();
            if (namedQuery.getResultList().size() > 0) {
                return namedQuery.getSingleResult().getImage();
            } else {
                return "noPhoto.jpg";
            }
        } finally {
            if (entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().rollback();
            }
        }
    }
}
