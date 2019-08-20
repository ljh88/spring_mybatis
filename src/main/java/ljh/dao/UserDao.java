package ljh.dao;


import ljh.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserDao {
    public User selectById(@Param("id") Integer id);

    public void updateById(User user);
}
