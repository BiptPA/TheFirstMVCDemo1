package example.dao;

import example.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IUserDao {

    List<User> getAllUsers();
    //接口形式定义了数据库操作方法

    int insertUsers(User user);

    void deleteUser(java.io.Serializable id);

    int updateUsers(User edituser);

    int updateEnable(@Param("caseId") String caseId);

    List<User> findUserById(@Param("autoid") String autoid);
//    public User selectByName(String username);

}
