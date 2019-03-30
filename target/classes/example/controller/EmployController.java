package example.controller;


import example.pojo.Deliveryrecord;
import example.pojo.Resume;
import example.service.IDeliveryrecordService;
import example.service.IEmployService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/employ/")
public class EmployController {

//    @Autowired
//    private IEmployService employService;

    @Autowired
    private IDeliveryrecordService deliveryrecordService;

    @RequestMapping(value = "getEmployInfo",method = RequestMethod.GET)
    public String getEmployInfo(HttpServletRequest request){
        //session,先使用一个userid的例子
        String userid= null;
        userid="2";
        List<Deliveryrecord> deliveryrecordinfo = deliveryrecordService.getPerDeliveryById(userid);
        request.setAttribute("deliverinfo",deliveryrecordinfo);
        return "employ/employInfo";

    }

}
