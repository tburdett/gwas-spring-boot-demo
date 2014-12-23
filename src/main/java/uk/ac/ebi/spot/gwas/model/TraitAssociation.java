package uk.ac.ebi.spot.gwas.model;

import org.apache.solr.client.solrj.beans.Field;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Javadocs go here!
 *
 * @author Tony Burdett
 * @date 13/11/14
 */
@Entity
public class TraitAssociation {
    @Id @GeneratedValue
//    @org.springframework.data.annotation.Id @Field
    private Long id;
//    @Field
    private String trait;

    @ManyToOne(optional = false)
    private Study study;
    @ManyToOne(optional = false)
    private Snp snp;

    TraitAssociation() {
    }

    TraitAssociation(String trait, Study study, Snp snp) {
        this.trait = trait;
        this.study = study;
        this.snp = snp;
    }

    public Long getId() {
        return id;
    }

    public String getTrait() {
        return trait;
    }

    public Study getStudy() {
        return study;
    }

    public Snp getSnp() {
        return snp;
    }

    @Override
    public String toString() {
        return "TraitAssociation{" +
                "id=" + id +
                ", trait=" + trait +
                ", study=" + study +
                ", snp=" + snp +
                '}';
    }
}
