package amrom.vcode.db.dao;

import amrom.vcode.db.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author linjinbao66@gmail.com
 * @date 2020/3/4
 */
public interface UserDao extends JpaRepository<User, Integer> {
    boolean existsUserByUsername(String userName);
}
