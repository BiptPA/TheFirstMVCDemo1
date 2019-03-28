package example.dao;

import example.pojo.Deliveryrecord;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IDeliveryDao {

    int adddeliveryrecords(Deliveryrecord deliveryrecord);


}
