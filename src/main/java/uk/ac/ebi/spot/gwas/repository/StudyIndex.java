package uk.ac.ebi.spot.gwas.repository;

import org.springframework.data.solr.repository.SolrCrudRepository;
import uk.ac.ebi.spot.gwas.model.Study;

/**
 * Javadocs go here!
 *
 * @author Tony Burdett
 * @date 22/12/14
 */
public interface StudyIndex extends SolrCrudRepository<Study, String> {
}
