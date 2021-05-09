package be.jvit.discworldcharacter.controller;

import be.jvit.discworldcharacter.controller.exception.BadRequestException;
import be.jvit.discworldcharacter.controller.exception.ForbiddenException;
import be.jvit.discworldcharacter.controller.exception.NotFoundException;
import be.jvit.discworldcharacter.controller.exception.UnAuthorizedException;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jonathan Vandersmissen
 * @created 5/9/2021
 * @project DiscWorldCharacter
 */
@RestController
@RequestMapping(path = "api/v1/character/status")
@AllArgsConstructor
public class CharacterStatusController {
    @RequestMapping(value = "/forbidden", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity forbiddenException() {
        throw new ForbiddenException();
    }

    @RequestMapping(value = "/notfound", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity notFoundException() {
        throw new NotFoundException();
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
