package javaschool.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.HashMap;
import java.util.*;

@Entity
@Table(name="orders", schema="client")
public class Orders {

    private Long id;
    private Long clientId;
    private String payment;
    private String delivery;
    private String paymentStatus;
    private String orderStatus;
    private Date orderDate;
    Map<Product,Integer> products = new LinkedHashMap<Product, Integer>();

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

    @Column(name="client_id", length = 10)
    public Long getClientId() {
        return clientId;
    }
    public void setClientId(Long clientId) {
        this.clientId = clientId;
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