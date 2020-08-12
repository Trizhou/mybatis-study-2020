package com.zhou.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @Description:
 * @Date: 2020/8/10 19:25
 **/
@Data
public class Blog {
    private String id;
    private String title;
    private String author;
    private Date createTime;
    private int views;
}
