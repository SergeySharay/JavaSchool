package javaschool.entity;

import java.sql.Date;
import java.util.HashMap;
import java.util.*;

public class Order {
    private Long id;
    private Long clientId;
    private Long clientAdressId;
    private Long productId;
    private String payment;
    private String delivery;
    private String paymentStatus;
    private String orderStatus;
    private Date orderDate;
    Map<Product,Integer> products = new HashMap<Product,Integer>();

    public Order() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public Long getClientAdressId() {
        return clientAdressId;
    }

    public void setClientAdressId(Long clientAdressId) {
        this.clientAdressId = clientAdressId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public String getDelivery() {
        return delivery;
    }

    public void setDelivery(String delivery) {
        this.delivery = delivery;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }



}