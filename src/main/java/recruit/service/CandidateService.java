package recruit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import recruit.entity.CandidateEntity;
import recruit.repository.CandidateEntityRepository;

import java.util.List;

/**
 * @author w
 */
@Service
public class CandidateService {
    @Autowired
    CandidateEntityRepository candidateEntityRepository;
    public List<CandidateEntity> queryAll(){
        return candidateEntityRepository.findAll();
    }
}
