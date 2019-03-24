package example.controller;

import example.pojo.DeliverDetail;
import example.pojo.Position;
import example.pojo.Resume;
import example.service.ICompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/company/")
public class CompanyController {

    @Autowired
    private ICompanyService companyService;

    @RequestMapping(value = "getCompany", method = RequestMethod.GET)
        public String getCompany(HttpServletRequest request){
        List<Position> company = companyService.getAllpositions();
        request.setAttribute("company",company);
        return "company/company";
        }


    @RequestMapping(value = "getCompanyDetail",method = RequestMethod.GET)
        public String getCompanyDetail(HttpServletRequest request){
        List<DeliverDetail> manage = companyService.getAllinfor();
        request.setAttribute("manage",manage);
        return "company/companydetail";
    }



}
