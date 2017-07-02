package sdre.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
public @NoArgsConstructor @Getter @Setter class Ingredient {

  private @Id @GeneratedValue Long id;

  private @Column(nullable = false) String name;

  private @ManyToMany(mappedBy = "ingredients") Set<Pizza> pizzas = new HashSet<>();
}
