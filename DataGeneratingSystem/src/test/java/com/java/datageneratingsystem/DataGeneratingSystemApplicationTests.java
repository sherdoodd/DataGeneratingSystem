package com.java.datageneratingsystem;

import com.baomidou.mybatisplus.core.toolkit.Assert;
import com.java.datageneratingsystem.entity.User;
import com.java.datageneratingsystem.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DataGeneratingSystemApplicationTests {


    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userMapper.selectList(null);
//        Assert.assertEquals(5, userList.size());
        userList.forEach(System.out::println);
    }

    @Test
    void contextLoads() {
    }

}
