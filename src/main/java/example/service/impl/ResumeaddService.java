package example.service.impl;

import example.dao.IResumeaddDao;
import example.pojo.Resume;
import example.service.IResumeaddService;
import org.springframework.stereotype.Service;

@Service
public class ResumeaddService implements IResumeaddService {

    IResumeaddDao dao;

    public String getinsert(Resume re)
    {
        int i= dao.insert(re);
        String message="";
        if(i>0)
        {
            message="添加成功";
        }else
            {
                message="添加失败";
            }
        return message;
    }


}
