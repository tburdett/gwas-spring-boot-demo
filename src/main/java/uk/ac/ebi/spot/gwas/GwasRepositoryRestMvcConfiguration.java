package uk.ac.ebi.spot.gwas;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;

import java.net.URI;

/**
 * Javadocs go here!
 *
 * @author Tony Burdett
 * @date 25/11/14
 */
@Configuration
class GwasRepositoryRestMvcConfiguration extends RepositoryRestMvcConfiguration {
    @Override
    protected void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.setBaseUri(URI.create("/api"));
    }
}
