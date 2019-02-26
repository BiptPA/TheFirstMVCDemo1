package example.dao;

import example.pojo.Resume;

import java.util.List;

public interface IResumeDao {
    List<Resume> getAllResumes();
    //接口形式定义了数据库操作方法
}
