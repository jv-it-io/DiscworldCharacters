package be.jvit.discworldcharacter.service.impl;

import be.jvit.discworldcharacter.domain.Wizzard;
import be.jvit.discworldcharacter.service.WizzardService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Jonathan Vandersmissen
 * @created 4/10/2021
 * @project DiscWorldCharacter
 */
@Service
public class WizzardServiceImpl implements WizzardService {
    @Override
    public List<Wizzard> getAllWizzards() {
        return null;
    }

    @Override
    public void addWizzard(Wizzard wizzard) {

    }

    @Override
    public void deleteWizzard(Long wizzardId) {

    }
}
