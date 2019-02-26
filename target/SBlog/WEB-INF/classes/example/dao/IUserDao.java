package example.dao;

import example.pojo.User;

import java.util.List;

public interface IUserDao {

    List<User> getAllUsers();
    //接口形式定义了数据库操作方法
//    public User selectByName(String username);

}
