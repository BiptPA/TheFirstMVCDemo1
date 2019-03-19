package example.dao;

import example.pojo.Position;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IPositionDao {
    List<Position> getAllPositions();

//    List<Position> getPersonPositions();

    Position selectByPrimaryKey(String positionid);

    int insertPositions(Position position);

    List<Position> findPositionById(@Param("positionid") String positionid);

    int updateposition(Position posi);

    void deletePosition(java.io.Serializable id);
}
