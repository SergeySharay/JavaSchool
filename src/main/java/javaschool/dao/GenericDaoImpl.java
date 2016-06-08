package javaschool.dao;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import java.io.Serializable;

public class GenericDaoImpl<T, PK extends Serializable> implements GenericDao<T,PK> {

    private Class<T> type;
    public EntityManager entityManager = Persistence.createEntityManagerFactory("clients").createEntityManager();
    public GenericDaoImpl() {}
    public GenericDaoImpl(Class<T> type) {
        this.type = type;
    }

    public T add(T object){
        entityManager.getTransaction().begin();
        T objectFromDB = entityManager.merge(object);
        entityManager.getTransaction().commit();
        return objectFromDB;

    }
    public void delete(PK id){
        entityManager.getTransaction().begin();
        entityManager.remove(get(id));
        entityManager.getTransaction().commit();

    }
    public T get(PK id){
        return entityManager.find(type, id);
       }
    public void update(T object){
        entityManager.getTransaction().begin();
        entityManager.merge(object);
        entityManager.getTransaction().commit();
            }

}
