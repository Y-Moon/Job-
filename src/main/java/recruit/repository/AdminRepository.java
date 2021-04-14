package recruit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import recruit.entity.table.AdminRoleEntity;

/**
 * @author w
 */
public interface AdminRepository extends JpaRepository<AdminRoleEntity, Long> {
    /**
     * 验证管理员身份
     * @param userName 账号
     * @param password 密码
     * @return 是否存在
     */
    boolean existsByUserNameAndPassword(String userName,String password);
}
