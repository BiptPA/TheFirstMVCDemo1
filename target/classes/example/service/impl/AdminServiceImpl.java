package example.service.impl;

import example.dao.IAdminDao;
import example.pojo.Admin;
import example.service.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AdminServiceImpl implements IAdminService {

    @Autowired
    private IAdminDao adminDao;

    @Override
    public Admin login(Admin admin){
        return adminDao.findAdmin(admin);
    }

}
