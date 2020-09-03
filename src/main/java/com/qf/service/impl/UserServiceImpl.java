package com.qf.service.impl;

import com.qf.mapper.UserMapper;
import com.qf.pojo.User;
import com.qf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
//    @Autowired
//    private JdbcTemplate jdbcTemplate;
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> findAll() {
        System.out.println("yes");
//        List<User> users = jdbcTemplate.query("select * from user", new BeanPropertyRowMapper<User>(User.class));
        List<User> users = userMapper.findAll();
        for (User user : users) {
            System.out.println(user);
        }
        return users;
    }
}
