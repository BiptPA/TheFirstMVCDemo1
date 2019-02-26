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
@RequestMapping("/resume")
public class ResumeselectController {

    @Autowired
    private IResumeService resumeService;

    @RequestMapping(value = "getResume", method = RequestMethod.GET)
    public String getResume(HttpServletRequest request) {
        List<Resume> re = resumeService.getAllResume();
        request.setAttribute("resume", re.get(0));
        return "resume/resume";
    }





}