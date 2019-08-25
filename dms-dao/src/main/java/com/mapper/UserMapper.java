package com.mapper;

import com.xiexx.domain.User;

import java.util.List;

/**

 ___    ___ ___    ___ 
|\  \  /  /|\  \  /  /|
\ \  \/  / | \  \/  / /
 \ \    / / \ \    / / 
  /     \/   /     \/  
 /  /\   \  /  /\   \  
/__/ /\ __\/__/ /\ __\ 
|__|/ \|__||__|/ \|__| 
                      
 *  Created by xiexin on 2019/8/25
 * 
 */
public interface UserMapper {
    int deleteByPrimaryKey(String id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String id);

    List<User> findAllUser();

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}