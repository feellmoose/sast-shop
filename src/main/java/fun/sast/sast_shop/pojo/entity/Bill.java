package fun.sast.sast_shop.pojo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bill {
    private long id;
    private long productId;
    private long userId;
    private Integer num;
    private BigDecimal amount;
    private int state;
}
