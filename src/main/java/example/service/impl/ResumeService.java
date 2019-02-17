package example.service.impl;
import example.dao.IResumeDao;
import example.pojo.Resume;
import example.service.IResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ResumeService implements IResumeService {

    @Autowired
    private IResumeDao resumeDao;

    @Override
    public List<Resume> getAllResume() {
        return resumeDao.getAllResumes();
    }
}
