package sdre.repository;

import org.springframework.data.repository.CrudRepository;

import sdre.domain.Ingredient;

public interface IngredientRepository extends CrudRepository<Ingredient, Long> {
}
