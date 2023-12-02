package fun.sast.sast_shop.repository;

import fun.sast.sast_shop.pojo.entity.Bill;
import fun.sast.sast_shop.pojo.entity.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BillRepository {
    Bill selectById(Long id);

    int updateById(Bill entity);

    List<Bill> selectAsList(List<Long> ids);

    List<Bill> selectByUserId(List<Long> userIds);

}
