package uk.ac.ebi.spot.gwas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import uk.ac.ebi.spot.gwas.model.SnpDocument;
import uk.ac.ebi.spot.gwas.model.StudyDocument;
import uk.ac.ebi.spot.gwas.model.TraitAssociationDocument;
import uk.ac.ebi.spot.gwas.repository.SnpIndex;
import uk.ac.ebi.spot.gwas.repository.SnpRepository;
import uk.ac.ebi.spot.gwas.repository.StudyIndex;
import uk.ac.ebi.spot.gwas.repository.StudyRepository;
import uk.ac.ebi.spot.gwas.repository.TraitAssociationIndex;
import uk.ac.ebi.spot.gwas.repository.TraitAssociationRepository;

import java.util.Arrays;

@SpringBootApplication
public class Application {
    @Autowired SnpRepository snpRepository;
    @Autowired StudyRepository studyRepository;
    @Autowired TraitAssociationRepository traitAssociationRepository;

    @Autowired SnpIndex snpIndex;
    @Autowired StudyIndex studyIndex;
    @Autowired TraitAssociationIndex traitAssociationIndex;

    public static void main(String[] args) {
        System.out.println("Starting Solr indexing application...");
        ApplicationContext ctx = SpringApplication.run(Application.class, args);
        System.out.println("Application executed successfully!");
        SpringApplication.exit(ctx);
    }

    @Bean CommandLineRunner run() {
        return strings -> {
            System.out.println("Building indexes with supplied params: " + Arrays.toString(strings));
            studyRepository.findAll().forEach(
                    study -> studyIndex.save(new StudyDocument(study)));
            snpRepository.findAll().forEach(
                    snp -> snpIndex.save(new SnpDocument(snp)));
            traitAssociationRepository.findAll().forEach(
                    traitAssociation -> traitAssociationIndex.save(new TraitAssociationDocument(traitAssociation)));
            System.out.println("Indexing building complete - application will now exit");
        };
    }
}
