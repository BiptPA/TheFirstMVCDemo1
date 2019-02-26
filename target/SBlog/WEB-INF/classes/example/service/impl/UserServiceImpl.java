package example.service.impl;
import example.dao.IUserDao;
import example.pojo.User;
import example.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Component
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao userDao;

    @Override
    public List<User> getAllUser() {
        return userDao.getAllUsers();
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

