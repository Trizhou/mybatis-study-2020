package com.zhou.dao;

import com.zhou.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    User getUserById(@Param("id") int id);

    int updateUser(User user);
}
