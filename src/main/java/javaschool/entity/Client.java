package javaschool.entity;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name="clients", schema="client")
@NamedQuery(name="Client.getClients",query = "SELECT C from Client C")

public class Client {

    private Long clientId;
    private String email;
    private String name;
    private String surname;
    private String password;
    private Integer permission;
    private Date birthday;

    private Set<ClientAdress> clientAdressSet;


    public Client(){
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id", length = 10, unique = true, nullable = false)
    public Long getId(){
        return clientId;
    }
    public void setId(Long  id){
        this.clientId=id;
    }

    @OneToMany(mappedBy="client", fetch = FetchType.LAZY)
    public Set<ClientAdress> getClientAdressSet() {
        return clientAdressSet;
    }
    public void setClientAdressSet(Set<ClientAdress> clientAdressSet) {
        this.clientAdressSet = clientAdressSet;
    }

    @Column(name="client_email", length = 100)
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name="client_name", length = 50)
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Column(name="client_surname", length = 50)
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Column(name="client_password", length = 50)
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    @Column(name="client_permission", length = 50)
    public Integer getPermission() {
        return permission;
    }
    public void setPermission(Integer permission) {
        this.permission = permission;
    }

    @Column(name="client_birhtday")
    public Date getBirthday() {
        return birthday;
    }
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }


}

