package be.jvit.discworldcharacter.service;

import be.jvit.discworldcharacter.domain.Wizzard;

import java.util.List;

/**
 * @author Jonathan Vandersmissen
 * @created 4/10/2021
 * @project DiscWorldCharacter
 */
public interface WizzardService {
    List<Wizzard> getAllWizzards();

    void addWizzard(Wizzard wizzard);

    void deleteWizzard(Long wizardId);
}
