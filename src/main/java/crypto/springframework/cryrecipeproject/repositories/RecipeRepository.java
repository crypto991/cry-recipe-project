package crypto.springframework.cryrecipeproject.repositories;

import crypto.springframework.cryrecipeproject.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {

}
