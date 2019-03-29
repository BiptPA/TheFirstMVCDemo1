package example.service.impl;

import example.dao.IDeliveryDao;
import example.dao.IResumeDao;
import example.dto.ResumeDto;
import example.pojo.Deliveryrecord;
import example.pojo.Resume;
import example.service.IDeliveryrecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DeliveryrecordServiceImpl implements IDeliveryrecordService {

    @Autowired
    private IDeliveryDao deliveryDao;


    @Override
    public int adddeliveryrecord(String positionid,String resumeid,String userid,String realname,String positions){
        Deliveryrecord deliveryrecord = new Deliveryrecord();
        deliveryrecord.setPositionid(Integer.parseInt(positionid));
        deliveryrecord.setResumeid(Integer.parseInt(resumeid));
        deliveryrecord.setUserid(Integer.parseInt(userid));
        deliveryrecord.setRealname(realname);
        deliveryrecord.setPositions(positions);
        return deliveryDao.adddeliveryrecords(deliveryrecord);
    }

    @Override
    public Deliveryrecord getDeliveryRecordById(String id){
        List<Deliveryrecord> d = deliveryDao.findDeliverById(id);
        if(d.size()>0){
            return d.get(0);
        }
        return null;
    }

    @Override
    public int updateDeliver(String id,String acceptorrefuse){
        Deliveryrecord deliveryrecords = new Deliveryrecord();
        int deliverid = Integer.parseInt(id);
        deliveryrecords.setDeliverid(deliverid);
        deliveryrecords.setAcceptorrefuse(acceptorrefuse);
        return deliveryDao.updateById(deliveryrecords);
    }




    @Override
    public List<Deliveryrecord> getAllRecord(String positionid){
        List<Deliveryrecord> record = deliveryDao.getRecord(positionid);
        return record;
    }


}
