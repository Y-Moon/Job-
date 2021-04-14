package recruit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import recruit.entity.table.UserRoleEntity;

import java.util.Optional;

/**
 * @author w
 */
public interface UserRoleRepository extends JpaRepository<UserRoleEntity, Long> {
    /**
     * 验证用户身份
     * @param userName 账号
     * @param password 密码
     * @return 是否存在
     */
    boolean existsByUserNameAndPassword(String userName,String password);

    /**
     * 找到对应邮箱的实体
     * @param userName 用户名
     * @return 找到的角色对象实体
     */
    UserRoleEntity findByUserName(String userName);

}
