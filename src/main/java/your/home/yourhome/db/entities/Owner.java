package your.home.yourhome.db.entities;

import lombok.Data;
import org.hibernate.annotations.Columns;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
public class Owner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Integer id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "dob")
    private Date dob;

    @OneToMany(mappedBy = "owner", fetch = FetchType.LAZY)
    private Set <Room> rooms = new HashSet<>();
}
