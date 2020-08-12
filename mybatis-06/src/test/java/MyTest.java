import com.zhou.dao.StudentMapper;
import com.zhou.dao.TeacherMapper;
import com.zhou.pojo.Student;
import com.zhou.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @Description:
 * @Date: 2020/8/10 16:18
 **/
public class MyTest {
    public static void main(String[] args) {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        TeacherMapper teacherMapper = sqlSession.getMapper(TeacherMapper.class);
        System.out.println(teacherMapper.getTeacherById(1));

        sqlSession.close();
    }

    @Test
    public void getStudentList() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        for (Student student : mapper.getStudentList2()) {
            System.out.println(student);
        }

        sqlSession.close();
    }
}
