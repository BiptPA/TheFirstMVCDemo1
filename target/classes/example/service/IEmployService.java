package example.service;

import javax.servlet.http.HttpSession;

public interface IEmployService {

    /**
     * 根据当前登陆用户获取HR所在公司ID
     * @return
     */
    String getCompanyId( HttpSession session);
}
