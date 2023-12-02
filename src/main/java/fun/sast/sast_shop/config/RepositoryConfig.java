package fun.sast.sast_shop.config;

import fun.sast.sast_shop.pojo.entity.Bill;
import fun.sast.sast_shop.pojo.entity.Product;
import fun.sast.sast_shop.pojo.entity.User;
import fun.sast.sast_shop.pojo.model.BillModel;
import fun.sast.sast_shop.repository.BillRepository;
import fun.sast.sast_shop.repository.ProductRepository;
import fun.sast.sast_shop.repository.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;
import java.util.List;

@Configuration
public class RepositoryConfig {

    /**
     * 开始使用数据库前注入的假仓储层
     */

    private final Product product = new Product(1, "test product", "this is a test product", BigDecimal.valueOf(10000));
    private final User user = new User(1,"felmose","email","12312312312",123,"123");

    private final List<Bill> bills = List.of(
            new Bill(1,1,1,2,BigDecimal.valueOf(100), BillModel.State.cancel.getNum()),
            new Bill(2,1,1,3,BigDecimal.valueOf(150), BillModel.State.pay.getNum()),
            new Bill(3,1,1,3,BigDecimal.valueOf(150), BillModel.State.wait.getNum()),
            new Bill(4,1,1,3,BigDecimal.valueOf(150), BillModel.State.cancel.getNum())
    );

    @Bean
    public ProductRepository productRepository(){
        return new ProductRepository() {
            @Override
            public Product selectById(Long id) {
                return product;
            }
            @Override
            public int updateById(Product entity) {
                return 1;
            }
            @Override
            public List<Product> selectAsList(List<Long> ids) {
                return List.of(product);
            }
            @Override
            public int deleteById(Long id) {
                return 1;
            }
            @Override
            public int insert(Product entity) {
                return 1;
            }
        };
    }

    @Bean
    public UserRepository userRepository(){
        return id -> user;
    }

    @Bean
    public BillRepository billRepository(){
        return new BillRepository() {
            @Override
            public Bill selectById(Long id) {
                return bills.get(id.intValue());
            }

            @Override
            public int updateById(Bill entity) {
                return 1;
            }

            @Override
            public List<Bill> selectAsList(List<Long> ids) {
                return bills;
            }

            @Override
            public List<Bill> selectByUserId(List<Long> userIds) {
                return bills;
            }
        };
    }




}
