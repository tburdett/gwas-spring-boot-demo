package uk.ac.ebi.spot.gwas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uk.ac.ebi.spot.gwas.model.Study;


import java.util.Collection;

/**
 * Javadocs go here!
 *
 * @author Tony Burdett
 * @date 13/11/14
 */
@RepositoryRestResource public interface StudyRepository extends JpaRepository<Study, Long> {
    Collection<Study> findByPubmedId(String pubmedId);
}
