package recruit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import recruit.entity.dto.company.CandidateEntity;
import recruit.entity.table.CompanyRoleEntity;
import recruit.entity.table.DeliverEntity;
import recruit.entity.table.UserRoleEntity;
import recruit.repository.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author w
 */
@Service
public class CandidateService {
    @Autowired
    CompanyRoleRepository companyRoleRepository;
    @Autowired
    UserRoleRepository userRoleRepository;
    @Autowired
    DeliverRepository deliverRepository;

    public List<CandidateEntity> queryAll(String username){
        List<CandidateEntity> candidateEntities=new ArrayList<>();
        CompanyRoleEntity companyRoleEntity = companyRoleRepository.findByUserName(username);
        long companyId=companyRoleEntity.getCompanyId();
        List<DeliverEntity> deliverEntities = deliverRepository.findByCompanyId(companyId);
        if(deliverEntities!=null){
            for (DeliverEntity deliverEntity : deliverEntities) {
                UserRoleEntity userRoleEntity = userRoleRepository.findByUserName(deliverEntity.getUsername());
                CandidateEntity candidateEntity=new CandidateEntity(userRoleEntity,deliverEntity.getJobName());
                candidateEntities.add(candidateEntity);
            }
        }else {
            System.out.println("userUsernames is null");
        }

        return candidateEntities;
    }
}
