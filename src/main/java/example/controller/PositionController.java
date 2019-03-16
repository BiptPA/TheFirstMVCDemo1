package example.controller;

import example.pojo.Position;
import example.service.IPositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
//查
@RequestMapping("/position/")
public class PositionController {
    @Autowired
    private IPositionService positionService;

    @RequestMapping(value = "getPosition" , method = RequestMethod.GET)
    public String getPosition(HttpServletRequest request) {
        List<Position> positions = positionService.getAllPosition();
        request.setAttribute("positions", positions);
        return "position/position";
    }

    //单个查询
     @RequestMapping(value = "getPersonPosition",method = RequestMethod.GET)
     public String getPersonPosition(HttpServletRequest request){
        List<Position> personposition = positionService.getPersonPosition();
        request.setAttribute("personposition",personposition);
        return "position/personposition";


    }
    //增
    @RequestMapping(value = "addPositionJsp",method = RequestMethod.GET)
    public String addPositionJsp() {
        return "position/addposition";
    }
    @RequestMapping(value = "addPosition",method = RequestMethod.POST)
    public String addPosition(HttpServletRequest request){
        String positions = request.getParameter("positions");
        String postype = request.getParameter("postype");
        String posdate = request.getParameter("posdate");
        String posnum = request.getParameter("posnum");
        String posdes = request.getParameter("posdes");
        String posreq = request.getParameter("posreq");
        String possal = request.getParameter("possal");
        String posphone = request.getParameter("posphone");
        String posloc = request.getParameter("posloc");
        String company = request.getParameter("company");
        String comdes = request.getParameter("comdes");
        positionService.insertPosition(positions,postype,posdate,posnum,posdes,posreq,possal,posphone,posloc,company,comdes);
        return "redirect:/position/getPosition";
}

//改
    @RequestMapping(value = "/updatepositionJsp",method = RequestMethod.POST)
    public String updatepositionJsp(HttpServletRequest request){
        String id = request.getParameter("positionid");
        Position pos = positionService.getPositionById(id);
        request.setAttribute("position",pos);
        return "position/editposition";
    }

    @RequestMapping(value = "/updatePosition",method = RequestMethod.POST)
    public String updatePosition(HttpServletRequest request){
        String id = request.getParameter("positionid");
        System.out.println(id);
        String positions = request.getParameter("positions");
        String postype = request.getParameter("postype");
        String posdate = request.getParameter("posdate");
        String posnum = request.getParameter("posnum");
        String posdes = request.getParameter("posdes");
        String posreq = request.getParameter("posreq");
        String possal = request.getParameter("possal");
        String posphone = request.getParameter("posphone");
        String posloc = request.getParameter("posloc");
        String company = request.getParameter("company");
        String comdes = request.getParameter("comdes");
        positionService.updateposition(id, positions, postype, posdate, posnum, posdes, posreq, possal, posphone, posloc, company, comdes);
        return "redirect:/position/getPosition";
    }

    @RequestMapping(value = "/deletePosition")
    public String deletePosition(int id){
        positionService.deletePosition(id);
        return "redirect:/position/getPosition";
    }


}
