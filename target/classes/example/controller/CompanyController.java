package example.controller;

import example.dto.CompanyDto;
import example.pojo.Employer;
import example.pojo.Position;
import example.service.ICompanyService;
import example.service.IEmployerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
@RequestMapping("/company/")
public class CompanyController {

    @Autowired
    private ICompanyService companyService;

    @Autowired
    private IEmployerService employerService;

    /**
     *公司和其对应的职位
     * @param request session
     * @return
     */
    @RequestMapping(value = "getCompany", method = RequestMethod.GET)
    public String getCompany(HttpServletRequest request) {
        HttpSession session  = request.getSession();
        //根据登录信息获取HR所在公司ID
        String companyId = employerService.getCompanyId(session);
        companyId="1";
//        System.out.println("公司编号是"+companyId);
        if (null != companyId) {
            //根据公司id获取公司信息和职位列表
//            System.out.println("companyId值是"+companyId+",Id已经传过来啦！");
            CompanyDto companyDto = companyService.getCompany(companyId);
            request.setAttribute("company", companyDto);
        }
        return "company/company";
    }



    @RequestMapping("HrLogin")
    public String HrLogin(Employer employer, Map<String,Object> map,HttpSession session){
        //hr登录
        Employer resultEmplorer = employerService.HrLogin(employer);
        if(resultEmplorer!=null) {
            //跳转welcome界面
            session.setAttribute("employer", resultEmplorer);
            return "redirect:/company/getCompany";
            }
            else{
                //跳转到index界面
                //登录时填写的用户数据
            map.put("employer",employer);
            //错误显示
            map.put("error","登录出错");
            return "errorpage/dlsb";
            }

    }


//    @RequestMapping(value = "getCompanyDetail",method = RequestMethod.GET)
//    public String getCompanyDetail(HttpServletRequest request) {
////        List<DeliverDetail> manage = companyService.getAllinfor();
////        request.setAttribute("manage",manage);
//        return "company/companydetail";
//    }



}
