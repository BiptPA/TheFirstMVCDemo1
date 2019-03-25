package example.service.impl;

import example.dao.IEmpolyDao;
import example.pojo.Employer;
import example.service.IEmployService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpSession;

@Component
public class EmployServiceImpl implements IEmployService {

    @Autowired
    private IEmpolyDao empolyDao;

    @Override
    public String getCompanyId(HttpSession session) {
        String account = (String) session.getAttribute("account");
        Employer employer = empolyDao.findEmployerByAccount(account);
        if (null != employer) {
            return employer.getCompanyId();
        }
        return null;
    }
}
