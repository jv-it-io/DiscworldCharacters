package be.jvit.discworldcharacter;

import be.jvit.discworldcharacter.config.ApplicationProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({ApplicationProperties.class})
public class DiscWorldCharacterApplication {

    public static void main(String[] args) {
        SpringApplication.run(DiscWorldCharacterApplication.class, args);
    }

}
