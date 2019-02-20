package example.service;

import example.pojo.Resume;
import org.springframework.stereotype.Service;

@Service
public interface IResumeaddService {
public String getinsert(Resume re);
}
