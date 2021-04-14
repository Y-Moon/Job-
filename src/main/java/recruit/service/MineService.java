package recruit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import recruit.entity.table.UserRoleEntity;
import recruit.repository.UserRoleRepository;

/**
 * @author w
 */
@Service
public class MineService {
    @Autowired
    UserRoleRepository userRoleRepository;

    public UserRoleEntity getUser(String username){
        return userRoleRepository.findByUserName(username);
    }
    public int modifyUserPassword(String username, String oldPassword, String newPassword){
        UserRoleEntity user = userRoleRepository.findByUserName(username);
        System.out.println(user);
        System.out.println(oldPassword);
        if(user!=null&&oldPassword.equals(user.getPassword())){
            user.setPassword(newPassword);
            userRoleRepository.save(user);
            return 1;
        }else {
            return 0;
        }
    }

    public void saveRecruitName(String username,String name){
        UserRoleEntity user = userRoleRepository.findByUserName(username);
        if(user!=null&&!name.equals(user.getRecruit())){
            user.setRecruit(name);
            userRoleRepository.save(user);
        }
    }
}
