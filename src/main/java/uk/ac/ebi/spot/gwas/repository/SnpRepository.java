package uk.ac.ebi.spot.gwas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uk.ac.ebi.spot.gwas.model.Snp;

/**
 * Javadocs go here!
 *
 * @author Tony Burdett
 * @date 13/11/14
 */
@RepositoryRestResource
public interface SnpRepository extends JpaRepository<Snp, Long> {
    Snp findByRsId(@Param(value = "q") String rsId);
}
