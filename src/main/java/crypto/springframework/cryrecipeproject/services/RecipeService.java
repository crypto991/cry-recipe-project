package crypto.springframework.cryrecipeproject.services;

import crypto.springframework.cryrecipeproject.commands.RecipeCommand;
import crypto.springframework.cryrecipeproject.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long l);

    RecipeCommand saveRecipeCommand(RecipeCommand command);


}
