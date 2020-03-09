package your.home.yourhome.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import your.home.yourhome.db.entities.Address;
import your.home.yourhome.db.entities.Price;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {
}
