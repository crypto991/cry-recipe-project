package crypto.springframework.cryrecipeproject.services;

import crypto.springframework.cryrecipeproject.commands.IngredientCommand;

public interface IngredientService {

    IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long ingredientId);


}
