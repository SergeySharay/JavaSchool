package javaschool.entity;

import javax.persistence.*;

@Entity
@Table(name="collections", schema="client")
@NamedQuery(name="Collection.getCollectionOfBrand",query = "SELECT C from Collection C where brand =:brand and collection=:collection")


public class Collection {

    private Long id;
    private String brand;
    private String collection;
    private String image;

    public Collection() {
    }

    public Collection(String brand, String collection, String image) {
        this.collection = collection;
        this.brand = brand;
        this.image = image;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id", length = 10, unique = true)
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    @Column(name="collection_brand", length = 50)
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Column(name="collection_name", length = 50)
    public String getCollection() {
        return collection;
    }
    public void setCollection(String name) {
        this.collection = name;
    }

    @Column(name="collection_image", length = 100)
    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }
}
