package crypto.springframework.cryrecipeproject.repositories;

import crypto.springframework.cryrecipeproject.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
