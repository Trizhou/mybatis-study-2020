package com.zhou.dao;

import com.zhou.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {

    @Select("select * from user")
    List<User> getUsers();

    // 方法存在多个参数时，所有的参数前面要加@Param
    @Select("select * from user where id = #{id}")
    User getUserById(@Param("id") int id);

    @Insert("insert into user(id, name, pwd) values(#{id}, #{name}, #{pwd})")
    int addUser(User user);
}
