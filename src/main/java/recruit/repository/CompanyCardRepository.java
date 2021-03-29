package recruit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import recruit.entity.CompanyCardEntity;

/**
 * @author w
 */
public interface CompanyCardRepository extends JpaRepository<CompanyCardEntity, Long> {
}
