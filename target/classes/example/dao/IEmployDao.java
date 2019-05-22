package example.dao;

import example.pojo.Employ;

import java.util.List;

public interface IEmployDao {

    Employ findEmploy(Employ employ);

    int addEmploy(Employ newEmploy);

    List<Employ> findEmployDetail();

    void deleteemploys(java.io.Serializable userid);
}
