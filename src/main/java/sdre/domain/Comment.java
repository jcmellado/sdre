package sdre.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
public @NoArgsConstructor @Getter @Setter class Comment {

  private @Id @GeneratedValue Long id;

  private @Column(name = "customer_id", nullable = false) Long customerId;

  private @Column(name = "pizza_id", nullable = false) Long pizzaId;

  private @Column(nullable = false) String text;

  private Integer rating;

  private @ManyToOne @JoinColumn(name = "customer_id", insertable = false, updatable = false) Customer customer;

  private @ManyToOne @JoinColumn(name = "pizza_id", insertable = false, updatable = false) Pizza pizza;
}
