package your.home.yourhome.db.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Integer id;

    @Column(name = "area")
    private Double area;

    @JoinColumn(name = "address_id")
    @OneToOne
    private Address address;

    @JoinColumn(name = "price_id")
    @OneToOne
    private Price price;

    @Column(name = "home_appliances")
    private String homeAppliances;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Owner owner;
}
