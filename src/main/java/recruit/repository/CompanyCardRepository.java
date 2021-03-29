package recruit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import recruit.entity.CompanyCardEntity;

public interface CompanyCardRepository extends JpaRepository<CompanyCardEntity, Long> {
}
