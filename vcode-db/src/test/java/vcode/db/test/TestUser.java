package vcode.db.test;

import amrom.vcode.db.DbApplication;
import amrom.vcode.db.entity.User;
import amrom.vcode.db.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author linjinbao66@gmail.com
 * @date 2020/3/4
 */
@EnableJpaAuditing
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {DbApplication.class})
public class TestUser {
    @Autowired
    private UserService userService;

    @Test
    public void queryUser(){
        User user = new User();
        user.setUsername("linjb");
        user.setPasswd("linj2");
        user.setIsactive(0);
        userService.addUser(user);
    }
}
