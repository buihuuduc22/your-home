package your.home.yourhome.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import your.home.yourhome.business.RoomService;

@RestController
@RequestMapping("/room")
public class RoomController {
    @Autowired
    private RoomService roomSv;

    @GetMapping("test")
    public final String getRooms() {
        return "HELLO WORLD";
    }
}
