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
public class SnpDocument {
    @org.springframework.data.annotation.Id @Field
    private String id;
    @Field
    private String rsId;

    public SnpDocument(Snp snp) {
        this.id = snp.getClass().getName().concat("_").concat(snp.getId().toString());
        this.rsId = snp.getRsId();
    }

    public String getId() {
        return id;
    }

    public String getRsId() {
        return rsId;
    }

    @Override
    public String toString() {
        return "SnpDocument{" +
                "id=" + id +
                ", rsId='" + rsId + '\'' +
                '}';
    }

}
