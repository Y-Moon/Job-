package recruit.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import recruit.entity.base.CompanyEntity;
import recruit.entity.base.JobEntity;
import recruit.entity.employ.HotCardEntity;
import recruit.repository.CompanyRepository;
import recruit.repository.JobRepository;

/**
 * @author w
 */
@Service
public class HotService {
    @Autowired
    private JobRepository jobRepository;
    @Autowired
    private CompanyRepository companyRepository;
    public List<HotCardEntity> queryAll(){
        //封装实体
        List<HotCardEntity> hotCardEntities=new ArrayList<>();
        List<JobEntity> all = jobRepository.findAll();
        for (JobEntity jobEntity : all) {
            Optional<CompanyEntity> companyEntity = companyRepository.findById(jobEntity.getCompanyId());
            HotCardEntity hotCardEntity=new HotCardEntity(jobEntity,companyEntity.orElse(new CompanyEntity()));
            hotCardEntities.add(hotCardEntity);
        }
        return hotCardEntities;
    }
}
