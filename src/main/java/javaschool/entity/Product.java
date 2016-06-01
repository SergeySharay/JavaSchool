package javaschool.entity;
import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="product", schema="client")
@NamedQueries({

        @NamedQuery(name = "Product.getProducts", query = "SELECT P from Product P"),
        @NamedQuery(name = "Product.getBrands", query = "SELECT P.brand from Product P"),
        @NamedQuery(name = "Product.getCollections", query = "SELECT P.collection from Product P where P.brand = :brand")

})

public class Product {
    private Long id;
    private String category;
    private String brand;
    private String collection;
    private String name;
    private String color;
    private String picture;
    private Long price;
    private Long length;
    private Long witdh;
    private Long weight;
    private Long quantity;
    private Set<Orders> orders= new HashSet<Orders>();

    public Product() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id", length = 10, unique = true, nullable = false)
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    @ManyToMany(mappedBy = "bucket")
    public Set<Orders> getOrders() {
        return orders;
    }
    public void setOrders(Set<Orders> orders) {
        this.orders = orders;
    }

    @Column(name="product_category", length = 100)
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    @Column(name="product_brand", length = 100)
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Column(name="product_collection", length = 100)
    public String getCollection() {
        return collection;
    }
    public void setCollection(String collection) {
        this.collection = collection;
    }

    @Column(name="product_name", length = 100)
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Column(name="product_color", length = 100)
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    @Column(name="product_picture", length = 100)
    public String getPicture() {
        return picture;
    }
    public void setPicture(String picture) {
        this.picture = picture;
    }

    @Column(name="product_price", length = 10)
    public Long getPrice() {
        return price;
    }
    public void setPrice(Long price) {
        this.price = price;
    }

    @Column(name="product_length", length = 10)
    public Long getLength() {
        return length;
    }
    public void setLength(Long length) {
        this.length = length;
    }

    @Column(name="product_width", length = 10)
    public Long getWitdh() {
        return witdh;
    }
    public void setWitdh(Long witdh) {
        this.witdh = witdh;
    }

    @Column(name="product_weight", length = 10)
    public Long getWeight() {
        return weight;
    }
    public void setWeight(Long veight) {
        this.weight = veight;
    }

    @Column(name="product_quantity", length = 10)
    public Long getQuantity() {
        return quantity;
    }
    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }


}
