package example.dao;

import example.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IUserDao {

    List<User> getAllUsers();
    //接口形式定义了数据库操作方法

    int insertUsers(User user);

    int updateUsers(User edituser);

    List<User> findUserById(@Param("autoId") String autoId);
//    public User selectByName(String username);

}
