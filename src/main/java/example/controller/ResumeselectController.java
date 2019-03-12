package example.controller;

import example.pojo.Resume;
import example.pojo.User;
import example.service.IResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/resume/")
public class ResumeselectController {

    @Autowired
    private IResumeService resumeService;

    @RequestMapping(value = "getResume", method = RequestMethod.GET)
    public String getResume(HttpServletRequest request) {
        List<Resume> re = resumeService.getAllResume();
        request.setAttribute("resume", re);
        return "resume/resume";
    }

    @RequestMapping(value = "addreJsp",method = RequestMethod.GET)
    public String addreJsp(){
        return "resume/addresume";
    }
    @RequestMapping(value = "addResume",method = RequestMethod.POST)
    public String addResume(HttpServletRequest request){
        String realname = request.getParameter("realname");
        String idnum = request.getParameter("idnum");
        String sex = request.getParameter("sex");
        String education = request.getParameter("education");
        String school = request.getParameter("school");
        String languages = request.getParameter("languages");
        String lanlevel = request.getParameter("lanlevel");
        String comlevel = request.getParameter("comlevel");
        String major = request.getParameter("major");
        String workexp = request.getParameter("workexp");
        String positions = request.getParameter("positions");
        String exsalary = request.getParameter("exsalary");
        String phonenum = request.getParameter("phonenum");
        String email = request.getParameter("email");
        String qq = request.getParameter("qq");
        String nowaddress = request.getParameter("nowaddress");
        int addresume = resumeService.insertResume(realname,idnum,sex,education,school,languages,lanlevel,comlevel,major,workexp,positions,exsalary,phonenum,email,qq,nowaddress);
        return "redirect:/resume/getResume";
    }




@RequestMapping("/deleteresume")
    public String deleteresume(int id)
{
    resumeService.deleteresume(id);
    return "redirect:/resume/getResume";
}

}