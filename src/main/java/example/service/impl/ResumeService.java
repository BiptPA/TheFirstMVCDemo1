package example.service.impl;
import example.dao.IResumeDao;
import example.pojo.Resume;
import example.service.IResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.List;

@Component
public class ResumeService implements IResumeService {

    @Autowired
    private IResumeDao resumeDao;

    @Override
    public List<Resume> getAllResume() {
        return resumeDao.getAllResumes();
    }
    @Override
    public int insertResume(String realname,String idnum,String sex,String education,String school,String languages,String lanlevel,String comlevel,String major,String workexp,String positions,String exsalary,String phonenum,String email,String qq,String nowaddress){
        Resume resumes = new Resume();
        resumes.setRealname(realname);
        resumes.setIdnum(idnum);
        resumes.setSex(sex);
        resumes.setEducation(education);
        resumes.setSchool(school);
        resumes.setLanguages(languages);
        resumes.setLanlevel(lanlevel);
        resumes.setComlevel(comlevel);
        resumes.setMajor(major);
        resumes.setWorkexp(workexp);
        resumes.setPositions(positions);
        resumes.setExsalary(exsalary);
        resumes.setPositions(positions);
        resumes.setExsalary(exsalary);
        resumes.setPhonenum(phonenum);
        resumes.setEmail(email);
        resumes.setQq(qq);
        resumes.setNowaddress(nowaddress);
        return resumeDao.insertResumes(resumes);
    }

@Override
    public void deleteresume(Serializable id)

{
    resumeDao.deleteresume(id);
}


}


