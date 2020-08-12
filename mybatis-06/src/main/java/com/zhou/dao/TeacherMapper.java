package com.zhou.dao;

import com.zhou.pojo.Teacher;

public interface TeacherMapper {

    /*@Select("select * from teacher where id = #{id}")*/
    Teacher getTeacherById(int id);
}
