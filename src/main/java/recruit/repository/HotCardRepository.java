package recruit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import recruit.entity.HotCardEntity;

public interface HotCardRepository extends JpaRepository<HotCardEntity, Long> {
}
