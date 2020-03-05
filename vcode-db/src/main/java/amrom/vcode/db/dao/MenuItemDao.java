package amrom.vcode.db.dao;

import amrom.vcode.db.entity.MenuItem;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author linjinbao66@gmail.com
 * @date 2020/3/5
 */
public interface MenuItemDao extends JpaRepository<MenuItem,Integer> {
}
