package example.controller;

import example.pojo.Resume;
import example.service.IResumeaddService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/resume")
public class ResumeaddController {
    @Autowired
    private IResumeaddService resumeaddService;
    @RequestMapping("/insert")
    public String insert(HttpServletRequest request, Resume re)
    {
        String in = resumeaddService.getinsert(re);
        request.setAttribute("in",in);
        return "resumeadd.jsp";
    }


}
