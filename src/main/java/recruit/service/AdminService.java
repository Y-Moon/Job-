package recruit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import recruit.entity.dto.company.CertificateEntity;
import recruit.entity.table.CompanyRoleEntity;
import recruit.repository.CompanyRoleRepository;

import java.util.ArrayList;
import java.util.List;

/**
 * @author w
 */
@Service
public class AdminService {
    @Autowired
    CompanyRoleRepository companyRoleRepository;

    /**
     * 查询到的数据，封装到资质证书验证实体中
     * @return 资质证书实体列表
     */
    public List<CertificateEntity> queryApplicant(){
        List<CertificateEntity> certificateEntities=new ArrayList<>();
        List<CompanyRoleEntity> all = companyRoleRepository.findAll();
        all.forEach(companyRoleEntity->{
            CertificateEntity certificateEntity=new CertificateEntity(companyRoleEntity);
            certificateEntities.add(certificateEntity);
        });
        return certificateEntities;
    }
}
