package recruit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import recruit.entity.dto.company.JobPostEntity;
import recruit.entity.table.CompanyRoleEntity;
import recruit.entity.table.JobEntity;
import recruit.repository.CompanyRoleRepository;
import recruit.repository.JobRepository;

import java.util.List;

/**
 * @author 王
 */
@Service
public class CompanyCardService {
    @Autowired
    private JobRepository jobRepository;
    @Autowired
    private CompanyRoleRepository companyRoleRepository;

    public List<JobEntity> queryAll(String username){
        CompanyRoleEntity companyRoleEntity = companyRoleRepository.findByUserName(username);
        return jobRepository.findAllByCompanyId(companyRoleEntity.getCompanyId());
    }

    public int delJob(int id) {
        jobRepository.deleteById((long)id);
        return 1;
    }
    public void addJob(JobPostEntity jobPostEntity){
        JobEntity jobEntity = jobPostEntity.getJobEntity();
        jobRepository.save(jobEntity);
    }
}
