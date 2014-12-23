package uk.ac.ebi.spot.gwas.model;

import org.apache.solr.client.solrj.beans.Field;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Javadocs go here!
 *
 * @author Tony Burdett
 * @date 13/11/14
 */
@Entity
public class Study {
    @Id @GeneratedValue
//    @org.springframework.data.annotation.Id @Field
    private Long id;
//    @Field
    private String pubmedId;
//    @Field
    private String title;
//    @Field
    private String author;
//    @Field
    private String publication;

    public Study() {
    }

    public Study(String pubmedId, String title, String author, String publication) {
        this.pubmedId = pubmedId;
        this.title = title;
        this.author = author;
        this.publication = publication;
    }

    public Long getId() {
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

    @Override public String toString() {
        return "Study{" +
                "id=" + id +
                ", pubmedId='" + pubmedId + '\'' +
                '}';
    }
}
