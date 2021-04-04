package recruit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import recruit.entity.base.JobEntity;

import java.util.List;

/**
 * @author w
 */
public interface JobRepository extends JpaRepository<JobEntity, Long> {
    /**
     * 按照热度对工作进行排序
     * @return 工作列表
     */
//    List<JobEntity> findAllBySeeOrOrderBySeeDesc();
}
