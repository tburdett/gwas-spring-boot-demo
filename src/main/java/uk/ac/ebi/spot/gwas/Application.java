package uk.ac.ebi.spot.gwas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
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

@SpringBootApplication
public class Application {
    @Autowired SnpRepository snpRepository;
    @Autowired StudyRepository studyRepository;
    @Autowired TraitAssociationRepository traitAssociationRepository;

    @Autowired SnpIndex snpIndex;
    @Autowired StudyIndex studyIndex;
    @Autowired TraitAssociationIndex traitAssociationIndex;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean CommandLineRunner run() {
        return strings -> {
            snpRepository.findAll().forEach(snp -> snpIndex.save(new SnpDocument(snp)));
            studyRepository.findAll().forEach(study -> studyIndex.save(new StudyDocument(study)));
            traitAssociationRepository.findAll()
                    .forEach(traitAssociation -> traitAssociationIndex.save(new TraitAssociationDocument(
                            traitAssociation)));
        };
    }
}
