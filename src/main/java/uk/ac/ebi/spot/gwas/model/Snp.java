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
public class Snp {
    @Id
    @GeneratedValue
    private Long id;

    private String rsId;

    Snp() {
    }

    Snp(String rsId) {
        this.rsId = rsId;
    }

    public Long getId() {
        return id;
    }

    public String getRsId() {
        return rsId;
    }

    @Override public String toString() {
        return "SNP{" +
                "id=" + id +
                ", rsId='" + rsId + '\'' +
                '}';
    }
}
