package degree.api.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "ciclu_studiu")
public class CicluStudiu {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @Column(name = "tip_ciclu_studiu")
  private String tipCicluStudiu;

  @ManyToMany(mappedBy = "cicluStudiuSet")
  private Set<AnStudiu> anStudiuSet = new HashSet<AnStudiu>();;

  @ManyToMany(mappedBy = "cicluStdSet")
  private Set<ProgramaStudiu> programaStudiuSet = new HashSet<ProgramaStudiu>();

}
