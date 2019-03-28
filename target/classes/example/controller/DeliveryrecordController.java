package example.controller;


import example.pojo.Deliveryrecord;
import example.service.IDeliveryrecordService;
import org.springframework.beans.factory.HierarchicalBeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/deliveryrecord/")
public class DeliveryrecordController {

    @Autowired
    private IDeliveryrecordService deliveryrecordService;


    @RequestMapping(value = "addDeliveryrecord",method = RequestMethod.GET)
    public String addDeliveryrecord(HttpServletRequest request){
        String positionid = request.getParameter("positionid");
        String resumeid = request.getParameter("resumeid");
        String userid= request.getParameter("userid");
       // System.out.println(positionid+" "+resumeid+" "+userid);
        deliveryrecordService.adddeliveryrecord(positionid,resumeid,userid);
        return "deliveryrecord/addSuccess";
    }



}
