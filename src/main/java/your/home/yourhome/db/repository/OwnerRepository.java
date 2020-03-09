package your.home.yourhome.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import your.home.yourhome.db.entities.Owner;

@Repository
public interface OwnerRepository extends JpaRepository<Owner, Integer> {
}
