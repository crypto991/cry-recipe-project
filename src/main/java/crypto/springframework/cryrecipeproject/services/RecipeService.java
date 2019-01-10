package crypto.springframework.cryrecipeproject.services;

import crypto.springframework.cryrecipeproject.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}
