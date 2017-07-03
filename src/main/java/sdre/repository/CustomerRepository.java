package sdre.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import sdre.domain.Customer;

@RepositoryRestResource(path = "people")
public interface CustomerRepository extends PagingAndSortingRepository<Customer, Long> {

  @RestResource(exported = false)
  List<Customer> findByName(@Param("name") String name);
}
