package be.jvit.discworldcharacter.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author Jonathan Vandersmissen
 * @created 4/10/2021
 * @project DiscWorldCharacter
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfig
        extends WebSecurityConfigurerAdapter {
    private static final String[] SWAGGER_URLS = {
// -- swagger ui
            "/swagger-resources/**",
            "/swagger-ui.html",
            "/v2/api-docs",
            "/webjars/**"
    };
    @Override
    protected void configure(
            HttpSecurity httpSecurity) throws Exception {
        httpSecurity
                .authorizeRequests()
                .antMatchers(SWAGGER_URLS).permitAll();
//other app configs
    }
}