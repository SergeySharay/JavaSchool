package javaschool.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.HashMap;
import java.util.*;

@Entity
@Table(name="orders", schema="client")
@NamedQueries({
@NamedQuery(name="Orders.getOrders",query = "SELECT O from Orders O"),
@NamedQuery(name="Orders.getClientOrders",query = "SELECT O.id from Orders O where client=:client")
        })

public class Orders {

    private Long id;
    private Client client;
    private String payment;
    private String delivery;
    private String paymentStatus;
    private String orderStatus;
    private Date orderDate;
    private Set <Product> bucket= new LinkedHashSet<Product>();

    public Orders() {
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

    @ManyToOne()
    @JoinColumn(name="client_id")
    public Client getClient() {
        return client;
    }
    public void setClient(Client client) {
        this.client = client;
    }

    @ManyToMany()
    @JoinTable(name = "order_product",
            joinColumns ={@JoinColumn(name="id_Order")},
            inverseJoinColumns={@JoinColumn(name="id_Product")})
    public Set<Product> getBucket() {
        return bucket;
    }
    public void setBucket(Set<Product> bucket) {
        this.bucket = bucket;
    }

    @Column(name="payment", length = 100)
    public String getPayment() {
        return payment;
    }
    public void setPayment(String payment) {
        this.payment = payment;
    }

    @Column(name="delivery", length = 100)
    public String getDelivery() {
        return delivery;
    }
    public void setDelivery(String delivery) {
        this.delivery = delivery;
    }

    @Column(name="payment_status", length = 100)
    public String getPaymentStatus() {
        return paymentStatus;
    }
    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    @Column(name="order_status", length = 50)
    public String getOrderStatus() {
        return orderStatus;
    }
    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Column(name="order_date")
    public Date getOrderDate() {
        return orderDate;
    }
    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }


}