package example.service;

import example.pojo.DeliverDetail;
import example.pojo.Position;

import java.util.List;

public interface ICompanyService {

    List<Position> getAllpositions();

    List<DeliverDetail> getAllinfor();
}
