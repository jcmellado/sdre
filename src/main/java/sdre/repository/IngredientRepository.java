package sdre.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import sdre.domain.Ingredient;

public interface IngredientRepository extends PagingAndSortingRepository<Ingredient, Long> {
}
