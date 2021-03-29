package recruit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import recruit.entity.CompanyCardEntity;
import recruit.repository.CompanyCardRepository;

/**
 * @author w
 */
@Service
public class CompanyService {
    @Autowired
    private CompanyCardRepository companyRepository;
    public List<CompanyCardEntity> queryAll(){
        return companyRepository.findAll();
    }
}
