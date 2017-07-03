package sdre.domain;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
public @NoArgsConstructor @Getter @Setter class Pizza {

  private @Id @GeneratedValue Long id;

  private @Column(nullable = false) String name;

  private @Column(nullable = false) BigDecimal price;

  @JoinTable(name = "Pizza_Ingredient", joinColumns = @JoinColumn(name = "pizza_id", referencedColumnName = "id"),
      inverseJoinColumns = @JoinColumn(name = "ingredient_id", referencedColumnName = "id"))
  private @ManyToMany Set<Ingredient> ingredients = new HashSet<>();

  private @OneToMany(mappedBy = "pizza") Set<Comment> comments = new HashSet<>();
}
