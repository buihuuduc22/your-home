package your.home.yourhome.db.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Price {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Integer id;

    @Column(name = "room_price")
    private Double roomPrice;

    @Column(name = "electric")
    private Double electric;

    @Column(name = "water")
    private Double water;

    @Column(name = "service")
    private Double service;

    @Column(name = "is_full_price", columnDefinition = "TINYINT")
    private Boolean fullPrice;

    @Column(name = "deposits")
    private Double deposits;
}
