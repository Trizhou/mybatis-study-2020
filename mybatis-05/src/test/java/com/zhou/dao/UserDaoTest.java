package com.zhou.dao;

import com.zhou.pojo.User;
import com.zhou.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @Description:
 * @Date: 2020/8/8 14:29
 **/
public class UserDaoTest {

    @Test
    public void getUsers() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        /*for (User user : mapper.getUsers()) {
            System.out.println(user);
        }*/

        /*User user = mapper.getUserById(1);
        System.out.println(user);*/

        User user = new User(6, "zhou6", "zhou6");
        mapper.addUser(user);

        sqlSession.commit();
        sqlSession.close();
    }
}
