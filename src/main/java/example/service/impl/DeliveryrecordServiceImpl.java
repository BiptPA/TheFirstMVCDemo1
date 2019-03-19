package example.service.impl;

import example.dao.IDeliveryDao;
import example.pojo.Deliveryrecord;
import example.service.IDeliveryrecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DeliveryrecordServiceImpl implements IDeliveryrecordService {

    @Autowired
    private IDeliveryDao deliveryDao;

    @Override
    public int adddeliveryrecord(String positionid,String resumeid,String userid){
        Deliveryrecord deliveryrecord = new Deliveryrecord();
        deliveryrecord.setPositionid(Integer.parseInt(positionid));
        deliveryrecord.setResumeid(Integer.parseInt(resumeid));
        deliveryrecord.setUserid(Integer.parseInt(userid));
        return deliveryDao.adddeliveryrecords(deliveryrecord);
    }


}
