package recruit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import recruit.entity.dto.employ.JobCardEntity;
import recruit.entity.table.CompanyRoleEntity;
import recruit.entity.table.DeliverEntity;
import recruit.entity.table.JobEntity;
import recruit.repository.CompanyRoleRepository;
import recruit.repository.DeliverRepository;
import recruit.repository.JobRepository;

import java.util.*;

@Service
public class JobService {
    @Autowired
    private JobRepository jobRepository;

    @Autowired
    private CompanyRoleRepository companyRoleRepository;

    @Autowired
    private DeliverRepository deliverRepository;

    public JobCardEntity getJobEntity(long id){
        JobEntity jobEntity = jobRepository.findAllById(id);
        Optional<CompanyRoleEntity> companyRoleEntity = companyRoleRepository.findById(jobEntity.getCompanyId());
        JobCardEntity jobCardEntity=new JobCardEntity(jobEntity,companyRoleEntity.orElse(new CompanyRoleEntity()));
        System.out.println(jobCardEntity);
        return jobCardEntity;
    }

    /**
     * state 0失败，1成功，2重复
     * @param username 用户名
     * @param jobId 工作id
     * @param companyId 公司id
     * @return 投递结果返回
     */
    public int choseJob(String username,long jobId,long companyId,String jobName){
        if(deliverRepository.existsByUsernameAndJobId(username,jobId)){
            return 2;
        }
        DeliverEntity deliverEntity=new DeliverEntity(0,username,jobId,companyId,jobName);
        deliverRepository.save(deliverEntity);
        return 1;
    }
}
