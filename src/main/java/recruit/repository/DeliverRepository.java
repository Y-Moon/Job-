package recruit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import recruit.entity.table.DeliverEntity;

import java.util.List;

/**
 * @author w
 */
public interface DeliverRepository extends JpaRepository<DeliverEntity, Long> {
    boolean existsByUsernameAndJobId(String username,Long jobId);

    /**
     * 根据投递记录表，查看求职者用户名
     * @param companyId 公司id
     * @return 返回username
     */
    List<DeliverEntity> findByCompanyId(Long companyId);
}
