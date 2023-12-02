package fun.sast.sast_shop.repository;

import fun.sast.sast_shop.pojo.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository {
    User selectById(Long id);
}
