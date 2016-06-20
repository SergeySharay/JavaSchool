/**
 * Generic Dao class for All entities.
 *
 * @author Sergey Sharay
 * @version 1.0
 */
package javaschool.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.io.Serializable;

public class GenericDaoImpl<T, PK extends Serializable> implements GenericDao<T, PK> {

    private Class<T> type;
    /**
     * entityManagerFactory.
     */
    public static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("clients");
    /**
     * entityManager.
     */
    public EntityManager entityManager = entityManagerFactory.createEntityManager();

    /**
     * Class constructor.
     */
    public GenericDaoImpl() {
    }

    /**
     * Class constructor.
     */
    public GenericDaoImpl(Class<T> type) {
        this.type = type;
    }

    /**
     * Add an entity to DB
     *
     * @param object An entity for adding
     * @return An entity from DB after adding
     */
    public T add(T object) {
        //EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
            entityManager.getTransaction().begin();
            T objectFromDB = entityManager.merge(object);
            entityManager.getTransaction().commit();
            return objectFromDB;
        } finally {
            if (entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().rollback();
            }
            //entityManager.close();
        }

    }

    /**
     * Delete an entity from DB by Id.
     *
     * @param id Id from DB
     */
    public void delete(PK id) {
        //EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
            entityManager.getTransaction().begin();
            entityManager.remove(get(id));
            entityManager.getTransaction().commit();
        } finally {
            if (entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().rollback();
            }
            //entityManager.close();
        }

    }

    /**
     * Get an entity from DB by Id.
     *
     * @param id Id from DB.
     * @return An Entity from DB.
     */
    public T get(PK id) {
        //EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
            return entityManager.find(type, id);
        } finally {
            if (entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().rollback();
            }
            //entityManager.close();
        }
    }

    /**
     * Update current Entity in DB.
     *
     * @param object An Entity for update
     */
    public void update(T object) {
        //EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
            entityManager.getTransaction().begin();
            entityManager.merge(object);
            entityManager.getTransaction().commit();
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
