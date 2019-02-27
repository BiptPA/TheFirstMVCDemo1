package example.service.impl;
import example.dao.IUserDao;
import example.pojo.User;
import example.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import java.util.List;
@Component
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao userDao;

    @Override
    public List<User> getAllUser() {
        return userDao.getAllUsers();
    }

    @Override
    public int insertUser(String username, String password) {
        User user = new User();
        user.setUserName(username);
        user.setPassword(password);
        return userDao.insertUsers(user);
    }

    @Override
    public User getUserById(String id) {
            List<User> users = userDao.findUserById( id);
            if (users.size() > 0) {
                return users.get(0);
            }
            return null;
    }

    @Override
    public int update(String username)
    {
        User edituser = new User();
        edituser.setUserName(username);
        return userDao.updateUsers(edituser);
    }

    //下面是实现登陆的服务层代码；
    //自动注入iuserdao 用于访问数据库
    //登录方法的实现,从jsp页面获取username与password
//    public boolean login(String username, String password) {
//        User user = Mapper.selectByName(username);
//        if (user != null) {
//            if (user.getUsername().equals(username) && user.getPassword().equals(password))
//                return true;
//        }
//        return false;
//    }
}

