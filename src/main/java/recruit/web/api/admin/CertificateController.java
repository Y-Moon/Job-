package recruit.web.api.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import recruit.entity.dto.company.CertificateEntity;
import recruit.service.AdminService;

import java.util.List;

/**
 * @author w
 */
@RestController
@RequestMapping("admin")
public class CertificateController {
    @Autowired
    AdminService adminService;

    @GetMapping("verifyCertificateList")
    public List<CertificateEntity> getVerifyCertificateList(){
        return adminService.queryApplicant();
    }
}
