package example.controller;
import example.pojo.User;
import example.pojo.Usertwo;
import example.service.IUserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/user/")
public class UserController {
    private static final Logger logger = Logger.getLogger(UserController.class);

    @Autowired
    private IUserService userService;

    @RequestMapping(value = "getUser", method = RequestMethod.GET)
    public String getUser(HttpServletRequest request) {
        List<User> users = userService.getAllUser();
        System.out.println(users);
        request.setAttribute("userList", users.get(0));
        return "user/userList";
    }


//    @RequestMapping(value = "/sql", produces = "text/html;charset=UTF-8")
//    @ResponseBody
//    public String sayHi(HttpServletRequest request, HttpServletResponse response) {
//        String name = request.getParameter("v");
//        List<Usertwo> users = service.getAllUser();
//        logger.info("{name:yxy,context:hi,你好}");
//        return name+"-{name:yxy,context:hi,你好}"+users;
//    }
//    //自动注入业务层的userService类
//    @Autowired
//    IUserService userService;
//    //login业务的访问位置为/user/login
//    @RequestMapping("/login")
//    public String login(User user,HttpServletRequest request){
//        //调用login方法来验证是否是注册用户
//        boolean loginType = userService.login(user.getUsername(),user.getPassword());
//        if(loginType){
//            //如果验证通过,则将用户信息传到前台
//            request.setAttribute("user",user);
//            //并跳转到success.jsp页面
//            return "dlcg";
//        }else{
//            //若不对,则将错误信息显示到错误页面
//            request.setAttribute("message","用户名密码错误");
//            return "dlsb";
//        }
//    }
}
