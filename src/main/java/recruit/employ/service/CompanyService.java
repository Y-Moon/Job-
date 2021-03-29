package recruit.employ.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import recruit.employ.entity.CompanyCardEntity;
import recruit.employ.mapper.CompanyMapper;

/**
 * @author w
 */
@Service
public class CompanyService {
    @Autowired
    private CompanyMapper companyMapper;
    public CompanyCardEntity[] queryAll(){
        return companyMapper.queryAllCompanyCard();
    }
}
