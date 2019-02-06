package crypto.springframework.cryrecipeproject.commands;

import crypto.springframework.cryrecipeproject.domain.Recipe;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
public class NotesCommand {

    private Long id;
    private String recipeNotes;
    private Recipe recipe;

}
