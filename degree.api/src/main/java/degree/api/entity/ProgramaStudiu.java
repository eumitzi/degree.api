package degree.api.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "programa_studiu")
public class ProgramaStudiu {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "detaliu_programa_studiu")
  private String detaliu;

  @ManyToMany(cascade = {
          CascadeType.PERSIST,
          CascadeType.MERGE },
          fetch = FetchType.EAGER)
  @JoinTable(
      name = "cicluStudiu_programaStudiu",
      joinColumns = @JoinColumn(name = "id_programe_studiu", referencedColumnName = "id"),
      inverseJoinColumns = @JoinColumn(name = "id_ciclu_studiu", referencedColumnName = "id"))
  private Set<CicluStudiu> cicluStdSet = new HashSet<>();;


}
