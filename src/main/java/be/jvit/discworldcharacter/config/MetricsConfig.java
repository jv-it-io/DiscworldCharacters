package be.jvit.discworldcharacter.config;

import io.micrometer.core.aop.TimedAspect;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Jonathan Vandersmissen
 * @created 5/3/2021
 * @project DiscWorldCharacter
 */
@Configuration
public class MetricsConfig {
    // io.micrometer.core.aop.TimedAspect
// org.springframework.context.annotation.Bean
// io.micrometer.core.instrument.MeterRegistry

    @Bean
    public TimedAspect timedAspect(MeterRegistry registry) {
        return new TimedAspect(registry);
    }
}
