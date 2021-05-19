package degree.api.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "discipline_general")
public class DisciplinaGeneral {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "nume")
  private String nume;

  @OneToMany(mappedBy = "disciplinaGeneral", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  private List<InstantaDisciplina> instantaDisciplinaList = new ArrayList<>();

}
