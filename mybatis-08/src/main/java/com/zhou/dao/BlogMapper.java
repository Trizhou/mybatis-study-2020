package com.zhou.dao;

import com.zhou.pojo.Blog;

import java.util.List;
import java.util.Map;

public interface BlogMapper {

    void addBlog(Blog blog);

    List<Blog> getBlogIF(Map map);

    List<Blog> getBlogChoose(Map map);

    int updateBlog(Map map);

    List<Blog> getBlogForeach(Map map);
}
