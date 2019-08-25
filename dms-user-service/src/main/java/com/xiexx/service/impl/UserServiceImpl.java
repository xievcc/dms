package com.xiexx.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.mapper.UserMapper;
import com.xiexx.domain.User;
import com.xiexx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.UUID;

/**
 * ___    ___ ___    ___
 * |\  \  /  /|\  \  /  /|
 * \ \  \/  / | \  \/  / /
 * \ \    / / \ \    / /
 * /     \/   /     \/
 * /  /\   \  /  /\   \
 * /__/ /\ __\/__/ /\ __\
 * |__|/ \|__||__|/ \|__|
 * <p>
 * Created by xiexin on 2019/8/25
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAllUser() {
        return userMapper.findAllUser();
    }

    @Override
    public User findUserById(String id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public void addUser(User user) {
        user.setId(UUID.randomUUID().toString());
        userMapper.insertSelective(user);
    }

    @Override
    public void updateUser(User user) {
        userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public void deleteUserById(String id) {
        userMapper.deleteByPrimaryKey(id);
    }
}
