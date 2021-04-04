package recruit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import recruit.entity.base.CompanyEntity;
import recruit.repository.CompanyRepository;

/**
 * @author w
 */
@Service
public class CompanyService {
    @Autowired
    private CompanyRepository companyRepository;
    public List<CompanyEntity> queryAll(){
        return companyRepository.findAll();
    }
}
