package your.home.yourhome.db.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Integer id;

    @Column(name = "city")
    private String city;

    @Column(name = "province")
    private String province;

    @Column(name = "district")
    private String district;

    @Column(name = "home_number")
    private String homeNumber;

}
