package your.home.yourhome.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import your.home.yourhome.db.entities.Price;
import your.home.yourhome.db.entities.Room;

@Repository
public interface PriceRepository extends JpaRepository<Price, Integer> {
}
