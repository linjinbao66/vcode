package amrom.vcode.db.service;

import amrom.vcode.db.dao.UserDao;
import amrom.vcode.db.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author linjinbao66@gmail.com
 * @date 2020/3/4
 */
@Service
public class UserService {
    private static Logger LOG = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UserDao userDao;

    /**
     * 新增
     * @param user
     * @return
     */
    public int addUser(User user){
        if(userDao.existsUserByUsername(user.getUsername())) return -1;
        userDao.save(user);
        return 0;
    }

    public int addUsers(List<User> users){
        userDao.saveAll(users);
        return 0;
    }

    /**
     * 根据id删除单个
     * @param id
     * @return
     */
    public int deleteUser(Integer id){
        userDao.deleteById(id);
        return 0;
    }
    public int deleteUser(List<Integer> ids){
        for (Integer id : ids){
            deleteUser(id);
        }
        return 0;
    }

    /**
     * 更新
     * @param user
     * @return
     */
    public int updateUser(User user){
        userDao.save(user);
        return 0;
    }

    /**
     * 根据id查询单个
     * @param id
     * @return
     */
    public Optional<User> queryUser(Integer id){
        return userDao.findById(id);
    }

    public List<User> queryUsers(List<Integer> ids){
        return userDao.findAllById(ids);
    }

    /**
     * 查询所有
     * @return
     */
    public List<User> queryAllUsers(){
        return userDao.findAll();
    }
}
