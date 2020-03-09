package your.home.yourhome.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import your.home.yourhome.db.entities.Owner;
import your.home.yourhome.db.entities.Room;

@Repository
public interface RoomRepository extends JpaRepository<Room, Integer> {
}
