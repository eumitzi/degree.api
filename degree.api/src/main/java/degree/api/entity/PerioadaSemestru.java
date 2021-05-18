package degree.api.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "perioada_semestru")
public class PerioadaSemestru {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @Column(name = "numar_semestru")
  private int numarSemestru;

  @Column(name = "data_inceput")
  private String dataInceput;

  @Column(name = "data_sfarsit")
  private String dataSfarsit;

  @ManyToMany(mappedBy = "perioadaSemestruSet")
  private Set<AnStudiu> anStudiuSet = new HashSet<AnStudiu>();
}
