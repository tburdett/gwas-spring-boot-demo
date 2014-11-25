package uk.ac.ebi.spot.gwas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uk.ac.ebi.spot.gwas.model.Snp;
import uk.ac.ebi.spot.gwas.model.Study;
import uk.ac.ebi.spot.gwas.model.TraitAssociation;

import java.util.Collection;

/**
 * Javadocs go here!
 *
 * @author Tony Burdett
 * @date 14/11/14
 */
@RepositoryRestResource
public interface TraitAssociationRepository extends JpaRepository<TraitAssociation, Long> {
    Collection<TraitAssociation> findByStudy(Study study);

    Collection<TraitAssociation> findBySnp(Snp snp);
}
