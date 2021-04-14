package recruit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import recruit.repository.AdminRepository;
import recruit.repository.CompanyRoleRepository;
import recruit.repository.UserRoleRepository;

/**
 * @author w
 */
@Service
public class LoginService {
    @Autowired
    UserRoleRepository userRoleRepository;

    @Autowired
    CompanyRoleRepository companyRoleRepository;

    @Autowired
    AdminRepository adminRepository;

    public int verifyRole(String userName,String password){
        boolean result = userRoleRepository.existsByUserNameAndPassword(userName,password);
        if(result){
            return 1;
        }
        result = companyRoleRepository.existsByUserNameAndPasswordAndState(userName,password,"1");
        if (result){
            return 2;
        }
        result = adminRepository.existsByUserNameAndPassword(userName,password);
        if (result){
            return 3;
        }
        return 0;
    }

}
