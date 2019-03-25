//package example.service.impl;
//import example.dao.IEmpolyDao;
//import example.pojo.User;
//import example.service.IUserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//
//import java.io.Serializable;
//import java.util.List;
//@Component
//public class UserServiceImpl implements IUserService {
//
//    @Autowired
//    private IEmpolyDao userDao;
//
//    @Override
//    public List<User> getAllUser() {
//        return userDao.getAllUsers();
//    }
//
//    @Override
//    public int insertUser(String username, String password) {
//        User user = new User();
//        user.setUsername(username);
//        user.setPassword(password);
//        return userDao.insertUsers(user);
//    }
//
//    @Override
//    public User getUserById(String id) {
//            List<User> users = userDao.findUserById( id);
//            if (users.size() > 0) {
//                return users.get(0);
//            }
//            return null;
//    }
//
//    @Override
//    public int update(String id,String username)
//    {
//        System.out.println(id);
//        User edituser = new User();
//        int autoid=Integer.parseInt(id);
//        edituser.setAutoid(autoid);
//        edituser.setUsername(username);
//        return userDao.updateUsers(edituser);
//    }
//
//    @Override
//    public void deleteUser(Serializable id)
//    {
//        userDao.deleteUser(id);
//    }
//
//
//    //下面是实现登陆的服务层代码；
//    //自动注入iuserdao 用于访问数据库
//    //登录方法的实现,从jsp页面获取username与password
////    public boolean login(String username, String password) {
////        User user = Mapper.selectByName(username);
////        if (user != null) {
////            if (user.getUsername().equals(username) && user.getPassword().equals(password))
////                return true;
////        }
////        return false;
////    }
//}
//
