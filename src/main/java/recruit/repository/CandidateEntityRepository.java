package recruit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import recruit.entity.CandidateEntity;

/**
 * @author w
 */
public interface CandidateEntityRepository extends JpaRepository<CandidateEntity, Long> {
}
