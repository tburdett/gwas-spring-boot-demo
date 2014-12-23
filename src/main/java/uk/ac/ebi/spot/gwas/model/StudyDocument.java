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
public class StudyDocument {
    @org.springframework.data.annotation.Id @Field
    private String id;
    @Field
    private String pubmedId;
    @Field
    private String title;
    @Field
    private String author;
    @Field
    private String publication;

    public StudyDocument(Study study) {
        this.id = study.getClass().getName().concat("_").concat(study.getId().toString());
        this.pubmedId = study.getPubmedId();
        this.title = study.getTitle();
        this.author = study.getAuthor();
        this.publication = study.getPublication();
    }

    public String getId() {
        return id;
    }

    public String getPubmedId() {
        return pubmedId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublication() {
        return publication;
    }
}
