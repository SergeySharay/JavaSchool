package javaschool.entity;


public class ClientAdress {
    private Long  id;
    private Long  clientId;
    private String country;
    private String city;
    private String street;
    private String house;
    private String flat;
    private Long  zipcode;

    public Long  getId() {
        return id;
    }

    public void setId(Long  id) {
        this.id = id;
    }

    public Long  getClientId() {
        return clientId;
    }

    public void setClientId(Long  clientId) {
        this.clientId = clientId;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getFlat() {
        return flat;
    }

    public void setFlat(String flat) {
        this.flat = flat;
    }

    public Long  getZipcode() {
        return zipcode;
    }

    public void setZipcode(Long  zipcode) {
        this.zipcode = zipcode;
    }
}
