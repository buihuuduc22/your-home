package your.home.yourhome.db.dto;

import lombok.Data;
import org.springframework.beans.BeanUtils;
import your.home.yourhome.db.entities.Owner;
import your.home.yourhome.db.entities.Room;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Data
public class OwnerResponse {
    private Integer id;
    private String firstName;
    private String lastName;
    private String name;
    private String address;
    private Date dob;
    private List<RoomResponse> rooms;

    public OwnerResponse() {
    }

    public OwnerResponse(Owner owner) {
        BeanUtils.copyProperties(owner, this);
        this.rooms = owner.getRooms().stream().map(RoomResponse::new).collect(Collectors.toList());
    }
}
