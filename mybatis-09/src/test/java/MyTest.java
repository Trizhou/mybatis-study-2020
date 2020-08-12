import com.zhou.dao.UserMapper;
import com.zhou.pojo.User;
import com.zhou.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @Description:
 * @Date: 2020/8/11 11:11
 **/
public class MyTest {
    @Test
    public void getUserById() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        SqlSession sqlSession2 = MyBatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        UserMapper mapper2 = sqlSession2.getMapper(UserMapper.class);

        User user = mapper.getUserById(1);
        System.out.println(user);
        sqlSession.close();

        User user2 = mapper2.getUserById(1);
        System.out.println(user2);
        System.out.println(user==user2);


    }
}
