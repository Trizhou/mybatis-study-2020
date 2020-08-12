package com.zhou.dao;

import com.zhou.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    List<User> getUserList();

    User getUserById(int id);

    int addUser(User user);

    //万能的map
    int addUserMap(Map<String, Object> map);

    int updateUser(User user);

    int deleteUserById(int id);
}
