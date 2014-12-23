package uk.ac.ebi.spot.gwas.model;

import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.solr.core.mapping.SolrDocument;

/**
 * Javadocs go here!
 *
 * @author Tony Burdett
 * @date 23/12/14
 */
@SolrDocument(solrCoreName = "gwas")
public class TraitAssociationDocument {
    @org.springframework.data.annotation.Id @Field
    private String id;
    @Field
    private String trait;
    @Field
    private String title;
    @Field
    private String rsId;
    @Field
    private String resourcename;

    public TraitAssociationDocument(TraitAssociation traitAssociation) {
        this.id = traitAssociation.getClass().getName().concat("_").concat(traitAssociation.getId().toString());
        this.trait = traitAssociation.getTrait();
        this.title = traitAssociation.getStudy().getTitle();
        this.rsId = traitAssociation.getSnp().getRsId();
        this.resourcename = traitAssociation.getClass().getSimpleName();
    }

    public String getId() {
        return id;
    }

    public String getTrait() {
        return trait;
    }

    public String getTitle() {
        return title;
    }

    public String getRsId() {
        return rsId;
    }

    public String getResourcename() {
        return resourcename;
    }
}
