package sdre.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import sdre.domain.Pizza;

public interface PizzaRepository extends PagingAndSortingRepository<Pizza, Long> {
}
