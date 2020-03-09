package your.home.yourhome.business;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import your.home.yourhome.db.dto.RoomResponse;
import your.home.yourhome.db.entities.Room;
import your.home.yourhome.db.repository.RoomRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RoomServiceImpl implements RoomService {

    private static final Logger logger = LoggerFactory.getLogger(RoomServiceImpl.class);

    @Autowired
    private RoomRepository roomRepo;

    @Override
    public List<RoomResponse> getRoms() {
        List<Room> rooms = roomRepo.findAll();
        return rooms.stream().map(RoomResponse::new).collect(Collectors.toList());
    }
}
