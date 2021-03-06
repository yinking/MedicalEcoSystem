package entities;
// Generated Dec 2, 2016 12:00:50 AM by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * City generated by hbm2java
 */
@Entity
@Table(name = "City", catalog = "MedicalEcoSystem"
)
public class City implements java.io.Serializable {

    private Integer id;
    private String city;

    public City() {
    }

    public City(String city) {
        this.city = city;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)

    @Column(name = "idCity", unique = true, nullable = false)

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "city", length = 45)

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return city; //To change body of generated methods, choose Tools | Templates.
    }

}
