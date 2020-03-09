package your.home.yourhome.db.dto;

import lombok.Data;
import org.springframework.beans.BeanUtils;
import your.home.yourhome.db.entities.Address;
import your.home.yourhome.db.entities.Owner;
import your.home.yourhome.db.entities.Price;
import your.home.yourhome.db.entities.Room;

import javax.persistence.*;

@Data
public class RoomResponse {
    private Integer id;
    private Double area;
    private Address address;
    private Price price;
    private String homeAppliances;
    private OwnerResponse owner;

    public RoomResponse() {
    }

    public RoomResponse(Room room) {
        BeanUtils.copyProperties(room, this);
        this.owner = new OwnerResponse(room.getOwner());
    }
}
