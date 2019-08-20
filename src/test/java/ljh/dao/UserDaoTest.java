package ljh.dao;

import ljh.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;


public class UserDaoTest {



    @Test
    public void UserDaoTest() throws IOException {

        InputStream is = Resources.getResourceAsStream("mybatis/SqlMapConfig.xml");
        //通过配置文件SqlMapConfig.xml,创建SqlSessionFactory对象,然后产生SqlSession,执行SQL语句
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        //获取sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //获取代理对象
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        User user = userDao.selectById(1);
        User user1 = userDao.selectById(1);
        System.out.println(user1);
        System.out.println(user);
        //关闭session
        sqlSession.close();
        SqlSession sqlSession1 = sqlSessionFactory.openSession();
        UserDao userDao1 = sqlSession1.getMapper(UserDao.class);
        User user2 = userDao1.selectById(1);
        System.out.println(user2);
    }
}