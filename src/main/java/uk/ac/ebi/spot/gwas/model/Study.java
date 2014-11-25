package uk.ac.ebi.spot.gwas.model;

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
    @Id
    @GeneratedValue
    private Long id;
    private String pubmedId;

    public Study() {
    }

    Study(String pubmedId) {
        this.pubmedId = pubmedId;
    }

    public Long getId() {
        return id;
    }

    public String getPubmedId() {
        return pubmedId;
    }

    public void setPubmedId(String pubmedId) {
        this.pubmedId = pubmedId;
    }

    @Override public String toString() {
        return "Study{" +
                "id=" + id +
                ", pubmedId='" + pubmedId + '\'' +
                '}';
    }
}
