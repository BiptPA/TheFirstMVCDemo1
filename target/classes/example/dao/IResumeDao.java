package example.dao;

import example.pojo.Resume;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IResumeDao {

    List<Resume> getAllResumes();

    int insertResumes(Resume resumes);
    //接口形式定义了数据库操作方法

    List<Resume> findResumeById(@Param("resumeid") String resumeid);

    void deleteresume(java.io.Serializable id);



    void updateresume(java.io.Serializable id);
}

