package recruit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import recruit.entity.table.CompanyRoleEntity;
import recruit.repository.CompanyRoleRepository;

/**
 * @author w
 */
@Service
public class CompanyService {
    @Autowired
    private CompanyRoleRepository companyRoleRepository;
    public List<CompanyRoleEntity> queryAll(){
        return companyRoleRepository.findAll();
    }
}
