package sdre.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
public @NoArgsConstructor @Getter @Setter class Pizza {

  private @Id @GeneratedValue Long id;

  private String name;
}
