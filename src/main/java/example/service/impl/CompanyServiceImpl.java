package example.service.impl;

import example.dao.ICompanyDao;
import example.pojo.Position;
import example.service.ICompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CompanyServiceImpl implements ICompanyService {
    @Autowired
    private ICompanyDao companyDao;
    @Override
    public List<Position> getAllpositions(){
        return companyDao.getAlljob();
    }

    @Override
    public List<String> getAllinfor(){
        return companyDao.getAllinformation();
    }




}
