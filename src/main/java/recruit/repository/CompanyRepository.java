package recruit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import recruit.entity.base.CompanyEntity;

import java.util.List;

/**
 * @author w
 */
public interface CompanyRepository extends JpaRepository<CompanyEntity, Long> {
}
