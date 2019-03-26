package example.service;

import example.pojo.Position;

import java.util.List;

public interface IPositionService {

    List<Position> getAllPosition();

//    List<Position> getPersonPosition();
    Position getperPositionById(String positionid);

    int insertPosition(String positions,String postype,String posdate,String posnum,String posdes,String posreq,String possal,String posphone,String posloc);

    Position getPositionById(String id);

    int updateposition(String id,String positions,String postype,String posdate,String posnum,String posdes,String posreq,String possal,String posphone,String posloc);

    void deletePosition(java.io.Serializable id);

}
