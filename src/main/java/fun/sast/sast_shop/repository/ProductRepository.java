package fun.sast.sast_shop.repository;

import fun.sast.sast_shop.pojo.entity.Product;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository {
    Product selectById(Long id);

    int updateById(Product entity);

    List<Product> selectAsList(List<Long> ids);

    int deleteById(Long id);

    int insert(Product entity);
}
