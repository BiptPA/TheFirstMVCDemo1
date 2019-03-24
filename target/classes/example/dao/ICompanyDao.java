package example.dao;

import example.pojo.DeliverDetail;
import example.pojo.Position;

import java.util.List;

public interface ICompanyDao {

    List<Position> getAlljob();

    List<DeliverDetail> getAllinformation();

}
