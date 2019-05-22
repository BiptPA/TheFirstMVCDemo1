package example.service;

import example.pojo.Employ;
import example.pojo.Resume;

import java.util.List;

public interface IEmployService {

    Employ login(Employ employ);

    int addEmploy(String account,String pwd,String realname,String sex,String age,String userid);

    List<Employ> getEmployInfom();

    void deleteemploy(java.io.Serializable userid);
}
