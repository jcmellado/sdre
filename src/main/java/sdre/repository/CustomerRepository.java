package sdre.repository;

import org.springframework.data.repository.CrudRepository;

import sdre.domain.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
