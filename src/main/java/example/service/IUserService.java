package example.service;
import example.pojo.User;

import java.util.List;

public interface IUserService {

    List<User> getAllUser();

    int insertUser(String username,String password);
    int update(String username);

    /**
     *
     * @param id
     */
    User getUserById(String id);

//    public boolean login(String username, String password);
}
