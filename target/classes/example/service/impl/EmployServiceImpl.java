package example.service.impl;

import example.dao.IEmployDao;
import example.pojo.Employ;
import example.service.IEmployService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.List;

@Component
public class EmployServiceImpl implements IEmployService  {

    @Autowired
    private IEmployDao employDao;

    @Override
    public Employ login(Employ employ){
        return employDao.findEmploy(employ);
    }


    @Override
    public int addEmploy(String account,String pwd,String realname,String sex,String age,String userid){
        Employ newEmploy = new Employ();
        newEmploy.setAccount(account);
        newEmploy.setPwd(pwd);
        newEmploy.setRealName(realname);
        newEmploy.setSex(sex);
        newEmploy.setAge(Integer.parseInt(age));
        newEmploy.setUserid(Integer.parseInt(userid));
        return employDao.addEmploy(newEmploy);
    }

    @Override
    public List<Employ> getEmployInfom(){
        return employDao.findEmployDetail();
    }

    @Override
    public void deleteemploy(Serializable userid) {
        employDao.deleteemploys(userid);
    }
}
