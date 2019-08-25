package com.xiexx.service;

import com.xiexx.domain.User;

import java.util.List;

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
public interface UserService {

    List<User> findAllUser();

    User findUserById(String id);

    void addUser(User user);

    void updateUser(User user);

    void deleteUserById(String id);
}
