package javaschool.dao;


import javaschool.entity.Collection;

import javax.persistence.TypedQuery;

public class CollectionDaoImpl extends GenericDaoImpl<Collection,Long> implements CollectionDao{
    public CollectionDaoImpl() {
        super(Collection.class);
    }

    public String getCollectionImage(String brand, String collection) {
        TypedQuery<Collection> namedQuery = entityManager.createNamedQuery("Collection.getCollectionOfBrand", Collection.class);
        namedQuery.setParameter("brand",brand);
        namedQuery.setParameter("collection",collection);
        if (namedQuery.getResultList().size()>0){
        return namedQuery.getSingleResult().getImage();
        }else return "noPhoto.jpg";
    }
}
