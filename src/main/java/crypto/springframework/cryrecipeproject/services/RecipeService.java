package crypto.springframework.cryrecipeproject.services;

import crypto.springframework.cryrecipeproject.commands.RecipeCommand;
import crypto.springframework.cryrecipeproject.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long id);

    RecipeCommand findCommandById(Long id);

    RecipeCommand saveRecipeCommand(RecipeCommand command);


}
