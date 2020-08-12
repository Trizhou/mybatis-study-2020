import com.zhou.dao.BlogMapper;
import com.zhou.pojo.Blog;
import com.zhou.utils.IDUtils;
import com.zhou.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * @Description:
 * @Date: 2020/8/10 19:47
 **/
public class MyTest {
    @Test
    public void test() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        Blog blog = new Blog();
        blog.setId(IDUtils.getId());
        blog.setTitle("mybatis");
        blog.setAuthor("zhou");
        blog.setCreateTime(new Date());
        blog.setViews(7);

        mapper.addBlog(blog);

        sqlSession.close();
    }

    @Test
    public void getBlogIF() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        HashMap<String, String> map = new HashMap<String, String>();
        //map.put("title", "java");
        map.put("author", "zhou");
        map.put("views", "700");

        List<Blog> blogs = mapper.getBlogChoose(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }

        sqlSession.close();
    }

    @Test
    public void updateBlog() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        HashMap<String, String> map = new HashMap<String, String>();
        map.put("id", "f92dd4cce1f04fa78699a8625763e7a8");
        map.put("title", "mybatis");
        //map.put("author", "zhou");
        map.put("views", "700");

        mapper.updateBlog(map);

        sqlSession.close();
    }

    @Test
    public void getBlogForeach() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        HashMap<String, Object> map = new HashMap<String, Object>();
        List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        map.put("ids", list);

        for (Blog blog : mapper.getBlogForeach(map)) {
            System.out.println(blog);
        }

        sqlSession.close();
    }
}
