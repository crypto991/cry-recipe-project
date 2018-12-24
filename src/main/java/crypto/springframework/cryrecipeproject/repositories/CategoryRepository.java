package crypto.springframework.cryrecipeproject.repositories;

import crypto.springframework.cryrecipeproject.domain.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category, Long> {


    Optional<Category> findByDescription(String description);
}
