package degree.api.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "profesori")
public class Profesor {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @OneToOne
  private Persoana persoana;

  @ManyToMany(mappedBy = "profesorSet")
  private Set<InstantaDisciplina> instantaDisciplinaSet = new HashSet<InstantaDisciplina>();

}
