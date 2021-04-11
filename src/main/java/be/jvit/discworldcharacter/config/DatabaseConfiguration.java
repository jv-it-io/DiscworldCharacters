package be.jvit.discworldcharacter.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * @author Jonathan Vandersmissen
 * @created 4/11/2021
 * @project DiscWorldCharacter
 */
@Configuration
@EnableMongoRepositories("be.jvit.discworldcharacter.repository")
@Import(value = MongoAutoConfiguration.class)
//@EnableMongoAuditing(auditorAwareRef = "springSecurityAuditorAware")
public class DatabaseConfiguration {

    private final Logger log = LoggerFactory.getLogger(DatabaseConfiguration.class);

    private ApplicationProperties applicationProperties;

    public DatabaseConfiguration(ApplicationProperties applicationProperties) {
        this.applicationProperties = applicationProperties;
    }
//
//    @Bean
//    public ValidatingMongoEventListener validatingMongoEventListener() {
//        return new ValidatingMongoEventListener(validator());
//    }
//
//    @Bean
//    public LocalValidatorFactoryBean validator() {
//        return new LocalValidatorFactoryBean();
//    }

//    @Bean
//    public CustomConversions customConversions() {
//        List<Converter<?, ?>> converters = new ArrayList<>();
////        converters.add(DateToZonedDateTimeConverter.INSTANCE);
////        converters.add(ZonedDateTimeToDateConverter.INSTANCE);
//        return new CustomConversions(converters);
//    }

//    @Bean
//    public CustomMongobee mongobee(MongoClient mongoClient, MongoTemplate mongoTemplate, MongoProperties mongoProperties,Environment env) {
//        log.debug("Configuring Mongobee");
//        CustomMongobee mongobee = new CustomMongobee(mongoClient);
//        mongobee.setDbName(mongoProperties.getDatabase());
//        mongobee.setMongoTemplate(mongoTemplate);
//        mongobee.setSpringEnvironment(env);
//
//        // package to scan for migrations
//        mongobee.setChangeLogsScanPackage("be.fgov.famhp.mpm.reference.config.dbmigrations");
//        mongobee.setEnabled(applicationProperties.getMongobee().isEnable());
//        return mongobee;
//    }

//    @Bean
//    public SearchMongoEventListener searchMongoEventListener(){
//        return new SearchMongoEventListener();
//    }
//
//    @Bean
//    public MongoNormalizedEntityIndexCreator mongoNormalizedEntityIndexCreator(MongoDbFactory mongoDbFactory, MongoMappingContext mappingContext){
//        return new MongoNormalizedEntityIndexCreator(mongoDbFactory, mappingContext);
//    }
//
//    @Bean
//    public MongoDBDataWebEndpoint mongoDBDataWebEndpoint(MongoTemplate mongotemplate){
//        return new MongoDBDataWebEndpoint(mongotemplate,"be.fgov.famhp.mpm.reference.domain" );
//    }
//
//    @Bean
//    public AuthorProvider authorProvider(){
//        return new JaversAuthorProvider();
//    }

}
