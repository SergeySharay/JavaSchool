package javaschool.entity;


import sun.rmi.runtime.Log;

import javax.persistence.*;



@Entity
@Table(name="order_product", schema="client")
@NamedQuery(name="OrderProduct.getOrderProducts",query = "SELECT O from OrderProduct O where idOrder=:order")

public class OrderProduct {
    private Long id;
    private Long idOrder;
    private Long idProduct;

    public OrderProduct() {
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

    @Column(name="id_Order", length = 10)
    public Long getIdOrder() {
        return idOrder;
    }
    public void setIdOrder(Long idOrder) {
        this.idOrder = idOrder;
    }

    @Column(name="id_Product", length = 10)
    public Long getIdProduct() {
        return idProduct;
    }
    public void setIdProduct(Long idProduct) {
        this.idProduct = idProduct;
    }
}
