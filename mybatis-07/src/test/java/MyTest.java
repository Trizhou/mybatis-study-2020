import com.zhou.dao.TeacherMapper;
import com.zhou.pojo.Teacher;
import com.zhou.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @Description:
 * @Date: 2020/8/10 17:10
 **/
public class MyTest {
    @Test
    public void test() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacherById2(1);
        System.out.println(teacher);

        sqlSession.close();
    }
}
