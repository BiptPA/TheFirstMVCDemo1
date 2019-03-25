package example.controller;

import example.dto.CompanyDto;
import example.service.ICompanyService;
import example.service.IEmployService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/company/")
public class CompanyController {

    @Autowired
    private ICompanyService companyService;

    @Autowired
    private IEmployService employService;

    @RequestMapping(value = "getCompany", method = RequestMethod.GET)
    public String getCompany(HttpServletRequest request) {
        HttpSession session  = request.getSession();
        //根据登录信息获取HR所在公司ID
        String companyId = employService.getCompanyId(session);
        if (null != companyId) {
            //根据公司id获取公司信息和职位列表
            CompanyDto companyDto = companyService.getCompany(companyId);
            request.setAttribute("company", companyDto);
        }
        return "company/company";
    }


//    @RequestMapping(value = "getCompanyDetail",method = RequestMethod.GET)
//    public String getCompanyDetail(HttpServletRequest request) {
////        List<DeliverDetail> manage = companyService.getAllinfor();
////        request.setAttribute("manage",manage);
//        return "company/companydetail";
//    }



}