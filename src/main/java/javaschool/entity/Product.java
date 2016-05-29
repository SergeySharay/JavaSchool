package javaschool.entity;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="product", schema="client")
@NamedQueries({

        @NamedQuery(name = "Product.getAll", query = "SELECT P from Product P"),
        @NamedQuery(name = "Product.BrandGetAll", query = "SELECT P.brand from Product P")

})

public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String category;

    @Column(name="product_brand", length = 100)
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

    public Product() {
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getCollection() {
        return collection;
    }
    public void setCollection(String collection) {
        this.collection = collection;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getPicture() {
        return picture;
    }
    public void setPicture(String picture) {
        this.picture = picture;
    }
    public Long getPrice() {
        return price;
    }
    public void setPrice(Long price) {
        this.price = price;
    }
    public Long getLength() {
        return length;
    }
    public void setLength(Long length) {
        this.length = length;
    }
    public Long getWitdh() {
        return witdh;
    }
    public void setWitdh(Long witdh) {
        this.witdh = witdh;
    }
    public Long getVeight() {
        return weight;
    }
    public void setVeight(Long veight) {
        this.weight = veight;
    }
    public Long getQuantity() {
        return quantity;
    }
    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }


}
