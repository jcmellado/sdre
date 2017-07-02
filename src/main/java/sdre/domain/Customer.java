package sdre.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
public @NoArgsConstructor @Getter @Setter class Customer {

  private @Id @GeneratedValue Long id;

  private @Column(nullable = false) String name;

  private @Column(nullable = false) String email;

  private @OneToMany(mappedBy = "customer") Set<Comment> comments = new HashSet<>();
}
