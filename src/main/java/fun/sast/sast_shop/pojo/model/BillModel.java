package fun.sast.sast_shop.pojo.model;

import fun.sast.sast_shop.pojo.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BillModel {
    private long id;
    private Product products;
    private Integer num;
    private BigDecimal amount;
    private State state;

    @Getter
    @AllArgsConstructor
    public enum State{
        wait(1),
        pay(2),
        cancel(3),
        failed(4);
        private final int num;
    }
}
