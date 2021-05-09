package be.jvit.discworldcharacter.controller.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author Jonathan Vandersmissen
 * @created 5/9/2021
 * @project DiscWorldCharacter
 */
@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason="Bad request exception")
public class BadRequestException extends RuntimeException {}
