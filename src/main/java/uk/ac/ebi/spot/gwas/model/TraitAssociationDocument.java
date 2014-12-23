package uk.ac.ebi.spot.gwas.model;

import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.solr.core.mapping.SolrDocument;

/**
 * Javadocs go here!
 *
 * @author Tony Burdett
 * @date 23/12/14
 */
@SolrDocument
public class TraitAssociationDocument {
    @org.springframework.data.annotation.Id @Field
    private Long id;
    @Field
    private String trait;
    @Field
    private String studyTitle;
    @Field
    private String snpRsId;

    public TraitAssociationDocument(TraitAssociation traitAssociation) {
        this.id = traitAssociation.getId();
        this.trait = traitAssociation.getTrait();
        this.studyTitle = traitAssociation.getStudy().getTitle();
        this.snpRsId = traitAssociation.getSnp().getRsId();
    }

    public Long getId() {
        return id;
    }

    public String getTrait() {
        return trait;
    }

    public String getStudyTitle() {
        return studyTitle;
    }

    public String getSnpRsId() {
        return snpRsId;
    }
}
