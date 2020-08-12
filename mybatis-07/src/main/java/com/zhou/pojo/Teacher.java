package com.zhou.pojo;

import lombok.Data;

import java.util.List;

/**
 * @Description:
 * @Date: 2020/8/10 16:11
 **/
@Data
public class Teacher {
    private int id;
    private String name;
    private List<Student> students;
}
