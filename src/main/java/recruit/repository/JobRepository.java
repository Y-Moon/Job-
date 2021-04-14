package recruit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import recruit.entity.table.JobEntity;

import java.util.List;

/**
 * @author w
 */
public interface JobRepository extends JpaRepository<JobEntity, Long> {
    /**
     * 根据公司id查询工作
     * @param id 公司id
     * @return 工作列表
     */
//    List<JobEntity> findAllBySeeOrOrderBySeeDesc();
    List<JobEntity> findAllByCompanyId(long id);
    /**
     * 按照热度对工作进行排序
     * @param category 工作的分类
     * @return 工作列表
     */
//    List<JobEntity> findAllBySeeOrOrderBySeeDesc();
    List<JobEntity> findAllByCategory(String category);
    /**
     * 按查找工作id
     * @param id 工作id
     * @return 工作实体
     */
    JobEntity findAllById(Long id);

}
