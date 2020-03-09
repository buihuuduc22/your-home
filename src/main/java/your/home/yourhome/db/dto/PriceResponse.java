package your.home.yourhome.db.dto;

import lombok.Data;
import org.springframework.beans.BeanUtils;
import your.home.yourhome.db.entities.Price;

import javax.persistence.*;

@Data
public class PriceResponse {
    private Integer id;
    private Double roomPrice;
    private Double electric;
    private Double water;
    private Double service;
    private Boolean fullPrice;
    private Double deposits;

    public PriceResponse() {
    }

    public PriceResponse(Price price) {
        BeanUtils.copyProperties(price, this);
    }
}
