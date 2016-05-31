package javaschool.entity;


import sun.rmi.runtime.Log;

import javax.persistence.*;



@Entity
@Table(name="order", schema="client")

public class Order {
    private Long idOrder;
    private Long idProduct;

    public Order() {
    }

    @Id
    @Column(name="id_Order", length = 10, unique = true, nullable = false)
    public Long getIdOrder() {
        return idOrder;
    }
    public void setIdOrder(Long idOrder) {
        this.idOrder = idOrder;
    }

    @Column(name="id_Product", length = 10, unique = true, nullable = false)
    public Long getIdProduct() {
        return idProduct;
    }
    public void setIdProduct(Long idProduct) {
        this.idProduct = idProduct;
    }
}
