package javaschool.dao;

import javaschool.entity.Collection;

public interface CollectionDao extends GenericDao<Collection, Long> {

    String getCollectionImage(String brand, String collection);
}