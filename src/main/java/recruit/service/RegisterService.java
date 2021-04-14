package recruit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import recruit.entity.table.UserRoleEntity;
import recruit.repository.UserRoleRepository;

/**
 * @author w
 */
@Service
public class RegisterService {
    @Autowired
    UserRoleRepository userRoleRepository;
    public int registerUser(String name,String userName,String password){
        UserRoleEntity userRoleEntity=new UserRoleEntity(name,userName,password);
        userRoleRepository.save(userRoleEntity);
        return 1;
    }

    public boolean registerCompany(){
        return true;
    }
}
