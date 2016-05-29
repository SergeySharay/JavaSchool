package javaschool.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="clients", schema="client")
@NamedQuery(name="Client.getAll",query = "SELECT C from Client C")

public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="client_email", length = 100)
    private String email;

    @Column(name="client_name", length = 50)
    private String name;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="client_birhtday")
    private Date birthday;
    public Client(){
    }
    public void setId(Long  id){
        this.id=id;
    }
    public Long getId(){
        return id;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    public Date getBirthday() {
        return birthday;
    }

}

