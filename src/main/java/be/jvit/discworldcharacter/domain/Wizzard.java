package be.jvit.discworldcharacter.domain;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

/**
 * @author Jonathan Vandersmissen
 * @created 4/10/2021
 * @project DiscWorldCharacter
 */
@ToString
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document
public class Wizzard implements Serializable {

    private String name;
    private String guild;
    private Species species;
    private Gender gender;
}
