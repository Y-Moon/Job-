package recruit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import recruit.entity.dto.employ.JobCardEntity;
import recruit.entity.table.CompanyRoleEntity;
import recruit.entity.table.JobEntity;
import recruit.repository.CompanyRoleRepository;
import recruit.repository.JobRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class SchoolService {
    @Autowired
    private JobRepository jobRepository;
    @Autowired
    private CompanyRoleRepository companyRoleRepository;

    public List<JobCardEntity> getJobCategoryCard(String category){
        List<JobCardEntity> categoryCardEntities=new ArrayList<>();
        List<JobEntity> allByCategory = jobRepository.findAllByCategory(category);
        for (JobEntity jobEntity : allByCategory) {
            Optional<CompanyRoleEntity> companyEntity = companyRoleRepository.findById(jobEntity.getCompanyId());
            JobCardEntity jobCardEntity =new JobCardEntity(jobEntity,companyEntity.orElse(new CompanyRoleEntity()));
            categoryCardEntities.add(jobCardEntity);
        }
        return categoryCardEntities;
    }
}
