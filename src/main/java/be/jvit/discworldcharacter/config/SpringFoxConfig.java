package be.jvit.discworldcharacter.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author Jonathan Vandersmissen
 * @created 4/10/2021
 * @project DiscWorldCharacter
 */
@Configuration
@EnableSwagger2
public class SpringFoxConfig {

    private final ApplicationProperties applicationProperties;

//    @Value("${swagger.host.url}")
    private String hostUrl;

    public SpringFoxConfig(ApplicationProperties applicationProperties) {
        this.applicationProperties = applicationProperties;
        hostUrl = applicationProperties.getSpringFoxUrl();
    }

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .host(hostUrl)
                .groupName("Spring Actuator")
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }
}
