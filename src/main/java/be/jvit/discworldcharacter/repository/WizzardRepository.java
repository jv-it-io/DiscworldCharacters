package be.jvit.discworldcharacter.repository;

import be.jvit.discworldcharacter.domain.Wizzard;
import org.javers.spring.annotation.JaversSpringDataAuditable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Jonathan Vandersmissen
 * @created 4/10/2021
 * @project DiscWorldCharacter
 */
@SuppressWarnings("unused")
@Repository
@JaversSpringDataAuditable
public interface WizzardRepository  extends MongoRepository<Wizzard, String> {
}
