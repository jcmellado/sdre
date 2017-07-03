package sdre.event;

import java.math.BigDecimal;

import org.springframework.data.rest.core.annotation.HandleBeforeCreate;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;
import org.springframework.stereotype.Component;

import sdre.domain.Pizza;

@Component
@RepositoryEventHandler(Pizza.class)
public class PizzaEventHandler {

  @HandleBeforeCreate
  public void beforePizzaSave(Pizza pizza) {
    pizza.setPrice(pizza.getPrice().multiply(new BigDecimal("0.9")));
  }
}
