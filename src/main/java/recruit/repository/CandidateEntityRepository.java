package recruit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import recruit.entity.CandidateEntity;

public interface CandidateEntityRepository extends JpaRepository<CandidateEntity, Long> {
}
