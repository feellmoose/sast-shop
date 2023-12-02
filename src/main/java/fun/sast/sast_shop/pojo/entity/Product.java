package fun.sast.sast_shop.pojo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @JsonIgnore
    public long id;
    public String name;
    public String description;
    public BigDecimal price;
}
