package com.zhou.dao;

import com.zhou.pojo.Student;

import java.util.List;

public interface StudentMapper {
    //查询所有学生信息及对应的老师信息
    List<Student> getStudentList();

    List<Student> getStudentList2();
}
