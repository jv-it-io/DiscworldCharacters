package be.jvit.discworldcharacter.config.dbmigrations;

import be.jvit.discworldcharacter.domain.Gender;
import be.jvit.discworldcharacter.domain.Species;
import be.jvit.discworldcharacter.domain.Wizzard;
import be.jvit.discworldcharacter.repository.WizzardRepository;
import com.github.cloudyrock.mongock.ChangeLog;
import com.github.cloudyrock.mongock.ChangeSet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Jonathan Vandersmissen
 * @created 4/11/2021
 * @project DiscWorldCharacter
 */
@ChangeLog(order = "001")
public class InitialSetupMigration {

    private final Logger log = LoggerFactory.getLogger(InitialSetupMigration.class);

    @ChangeSet(order = "01", author = "initiator", id = "01-wizzard")
    public void addAWizzard(WizzardRepository wizzardRepository) {
        log.info("Add wizzard changeSet 01");
        Wizzard wizzard = Wizzard.builder()
                .name("Rincewind")
                .gender(Gender.MALE)
                .guild("Wizzard")
                .species(Species.HUMAN)
                .build();
        wizzardRepository.save(wizzard);
    }
}
