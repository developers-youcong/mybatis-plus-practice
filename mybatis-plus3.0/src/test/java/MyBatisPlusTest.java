import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.blog.config.SqlSessionFactoryUtils;
import com.blog.dao.UserDao;
import com.blog.entity.User;

public class MyBatisPlusTest {

	@Test
	public void testName() throws Exception {
		
		  SqlSession sqlSession = null;
	      sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
	        
	      UserDao userDao = sqlSession.getMapper(UserDao.class);
	      
	      User user = userDao.selectOne(1);
	      
	      System.out.println(user.getUserName());
	      
	      sqlSession.close();
	}
	
}
