package recruit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import recruit.entity.base.JobEntity;
import recruit.repository.JobRepository;

import java.util.List;

/**
 * @author 王
 */
@Service
public class CompanyCardService {
    @Autowired
    private JobRepository hotRepository;
    public List<JobEntity> queryAll(){
        return hotRepository.findAll();
    }
}
