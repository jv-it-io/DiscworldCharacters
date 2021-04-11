package be.jvit.discworldcharacter.controller;

import be.jvit.discworldcharacter.domain.Wizzard;
import be.jvit.discworldcharacter.service.WizzardService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * @author Jonathan Vandersmissen
 * @created 4/10/2021
 * @project DiscWorldCharacter
 */
@RestController
@RequestMapping(path = "api/v1/wizzards")
@AllArgsConstructor
public class WizzardController {

    private final WizzardService wizzardService;

    @GetMapping
    public List<Wizzard> getAllWizzards() {
        return wizzardService.getAllWizzards();
    }

    @PostMapping
    public void addWizzard(@Valid @RequestBody Wizzard wizzard) {
        wizzardService.addWizzard(wizzard);
    }

    @DeleteMapping(path = "{wizzardId}")
    public void deleteWizard(
            @PathVariable("wizzardId") Long wizzardId) {
        wizzardService.deleteWizzard(wizzardId);
    }
}
