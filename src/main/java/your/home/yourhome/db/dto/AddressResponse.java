package your.home.yourhome.db.dto;

import lombok.Data;

import javax.persistence.*;

@Data
public class AddressResponse {
    private Integer id;
    private String city;
    private String province;
    private String district;
    private String homeNumber;
}
