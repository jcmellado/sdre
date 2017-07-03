package sdre.controller;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.hateoas.Resources;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import sdre.domain.Pizza;
import sdre.repository.PizzaRepository;

@RepositoryRestController
public class PizzaController {

  @Autowired
  private PizzaRepository repository;

  @RequestMapping(method = RequestMethod.GET, value = "/pizzas/search/findByName")
  public @ResponseBody ResponseEntity<?> getAll() {
    Iterable<Pizza> pizzas = repository.findAll();

    Resources<Pizza> resources = new Resources<>(pizzas);

    resources.add(linkTo(methodOn(PizzaController.class).getAll()).withSelfRel());

    return ResponseEntity.ok(resources);
  }
}