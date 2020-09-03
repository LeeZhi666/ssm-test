package com.qf;

import com.qf.pojo.User;
import com.qf.service.UserService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class test {

    @Autowired
    public static UserService userService;
    public static void main(String[] args) {
        System.out.println(userService);
        List<User> users = userService.findAll();
        for (User user : users) {
            System.out.println(user);
        }
    }
}
