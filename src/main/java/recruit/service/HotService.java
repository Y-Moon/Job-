package recruit.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import recruit.entity.table.CompanyRoleEntity;
import recruit.entity.table.JobEntity;
import recruit.entity.dto.employ.JobCardEntity;
import recruit.repository.CompanyRoleRepository;
import recruit.repository.JobRepository;

/**
 * @author w
 */
@Service
public class HotService {
    @Autowired
    private JobRepository jobRepository;
    @Autowired
    private CompanyRoleRepository companyRoleRepository;
    public List<JobCardEntity> queryAll(){
        //封装实体
        List<JobCardEntity> hotCardEntities=new ArrayList<>();
        List<JobEntity> all = jobRepository.findAll();
        for (JobEntity jobEntity : all) {
            Optional<CompanyRoleEntity> companyEntity = companyRoleRepository.findById(jobEntity.getCompanyId());
            JobCardEntity jobCardEntity =new JobCardEntity(jobEntity,companyEntity.orElse(new CompanyRoleEntity()));
            hotCardEntities.add(jobCardEntity);
        }
        return hotCardEntities;
    }
}
