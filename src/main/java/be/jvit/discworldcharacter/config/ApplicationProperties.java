package be.jvit.discworldcharacter.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Jonathan Vandersmissen
 * @created 4/11/2021
 * @project DiscWorldCharacter
 */
@Getter
@Setter
@ConfigurationProperties(prefix = "application", ignoreUnknownFields = false)
public class ApplicationProperties {
   private String springFoxUrl;
}
