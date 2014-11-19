package uk.ac.ebi.spot.gwas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import uk.ac.ebi.spot.gwas.repository.StudyRepository;

/**
 * Javadocs go here!
 *
 * @author Tony Burdett
 * @date 14/11/14
 */
@Controller
public class StudyMvcController {
    private StudyRepository studyRepository;

    @Autowired
    public StudyMvcController(StudyRepository studyRepository) {
        this.studyRepository = studyRepository;
    }

    @RequestMapping(value = "/studies.html", produces = MediaType.TEXT_HTML_VALUE)
    String studies(Model model) {
        model.addAttribute("studies", this.studyRepository.findAll());
        return "studies";
    }

    @RequestMapping(value = "/studies/{pubmedId}.html", produces = MediaType.TEXT_HTML_VALUE)
    String studies(Model model, @PathVariable String pubmedId) {
        model.addAttribute("studies", this.studyRepository.findByPubmedId(pubmedId));
        return "studies";
    }
}
