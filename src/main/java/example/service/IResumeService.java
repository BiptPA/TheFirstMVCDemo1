package example.service;

import example.pojo.Resume;

import java.util.List;

public interface IResumeService {
    List<Resume> getAllResume(String userid);

    List<Resume> getAllResumer(String positions,String userid);

    List<Resume> getEmployResumeById(String resumeid);

    int insertResume(String realname,String birthdays,String sex,String city,String phonenum, String email, String school, String education,String major,String workexp,String positions,String exsalary,String exaddress,String perdscp);

    void deleteresume(java.io.Serializable id);

    Resume getResumeById(String id);

    int updater(String id,String realname,String birthdays,String sex,String city,String phonenum, String email, String school, String education,String major,String workexp,String positions,String exsalary,String exaddress,String perdscp);

}

