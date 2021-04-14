package recruit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import recruit.entity.table.CompanyRoleEntity;

/**
 * @author w
 */
public  interface CompanyRoleRepository extends JpaRepository<CompanyRoleEntity, Long> {
    /**
     * 验证企业身份
     * @param userName 账号
     * @param password 密码
     * @param state 认证状态
     * @return 是否存在
     */
    boolean existsByUserNameAndPasswordAndState(String userName,String password,String state);

    /**
     * 根据公司邮箱查找公司
     * @param userName 公司邮箱(用户名)
     * @return 公司角色实体
     */
    CompanyRoleEntity findByUserName(String userName);


}
