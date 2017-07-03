package sdre.repository;

import org.springframework.data.repository.CrudRepository;

import sdre.domain.Pizza;

public interface PizzaRepository extends CrudRepository<Pizza, Long> {
}
