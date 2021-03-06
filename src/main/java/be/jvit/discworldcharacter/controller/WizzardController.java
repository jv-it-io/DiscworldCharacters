package be.jvit.discworldcharacter.controller;

import be.jvit.discworldcharacter.controller.exception.BadRequestException;
import be.jvit.discworldcharacter.controller.exception.ForbiddenException;
import be.jvit.discworldcharacter.controller.exception.UnAuthorizedException;
import be.jvit.discworldcharacter.domain.Wizzard;
import be.jvit.discworldcharacter.service.WizzardService;
import javassist.NotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
            @PathVariable("wizzardId") String wizzardId) {
        try {
            wizzardService.deleteWizzard(wizzardId);
        } catch (NotFoundException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping(value = "/forbidden", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity forbiddenException() {
        throw new ForbiddenException();
    }

    @RequestMapping(value = "/notfound", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity notFoundException() {
        throw new be.jvit.discworldcharacter.controller.exception.NotFoundException();
    }

    @RequestMapping(value = "/unauthorized", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity unauthorizedException() {
        throw new UnAuthorizedException();
    }

    @RequestMapping(value = "/badrequest", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity badRequestException() {
        throw new BadRequestException();
    }

    @RequestMapping(value = "/success", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity success() {
        return new ResponseEntity(HttpStatus.OK);
    }
}
