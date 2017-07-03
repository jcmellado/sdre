package sdre.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import sdre.domain.Customer;

public interface CustomerRepository extends PagingAndSortingRepository<Customer, Long> {
}
