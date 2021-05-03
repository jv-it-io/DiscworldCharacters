package be.jvit.discworldcharacter.service.impl;

import be.jvit.discworldcharacter.domain.Wizzard;
import be.jvit.discworldcharacter.repository.WizzardRepository;
import be.jvit.discworldcharacter.service.WizzardService;
import io.micrometer.core.annotation.Timed;
import javassist.NotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Jonathan Vandersmissen
 * @created 4/10/2021
 * @project DiscWorldCharacter
 */
@AllArgsConstructor
@Service
public class WizzardServiceImpl implements WizzardService {

    private final WizzardRepository wizzardRepository;

    @Override
    @Timed(value = "ServicegetAllWizzard.time", description = "Time taken to return all wizzards with the service")
    public List<Wizzard> getAllWizzards() {
        return wizzardRepository.findAll();
    }

    @Override
    public void addWizzard(Wizzard wizzard) {
        Wizzard saved_wizzard = wizzardRepository.save(wizzard);
    }

    @Override
    public void deleteWizzard(String wizzardId) throws NotFoundException {
        wizzardRepository.delete(wizzardRepository.findById(wizzardId).orElseThrow(
                () -> new NotFoundException("Wizzard not found with id " + wizzardId)
        ));
    }
}
