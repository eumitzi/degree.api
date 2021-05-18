package degree.api.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "an_studiu")
public class AnStudiu {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @Column(name = "an_studiu")
  private int an_studiu;

  @Column(name = "data_inceput")
  private String data_inceput;

  @Column(name = "data_sfarsit")
  private String data_sfarsit;

  @ManyToOne
  private AnUniversitar anUniversitar;

  @ManyToMany(
      cascade = CascadeType.ALL,
      fetch = FetchType.LAZY)
  @JoinTable(
      name = "anStudiu_cicluStudiu",
      joinColumns = @JoinColumn(name = "id_an_studiu", referencedColumnName = "id"),
      inverseJoinColumns = @JoinColumn(name = "id_ciclu_studiu", referencedColumnName = "id"))
  private Set<CicluStudiu> cicluStudiuSet = new HashSet<CicluStudiu>();

  @ManyToMany(
      cascade = {CascadeType.PERSIST, CascadeType.MERGE},
      fetch = FetchType.EAGER)
  @JoinTable(
      name = "anStudiu_perioadaSemestru",
      joinColumns = @JoinColumn(name = "id_an_studiu", referencedColumnName = "id"),
      inverseJoinColumns = @JoinColumn(name = "id_perioada_sem", referencedColumnName = "id"))
  private Set<PerioadaSemestru> perioadaSemestruSet = new HashSet<PerioadaSemestru>();

  @OneToMany(mappedBy = "anStudiu", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  private List<InstantaDisciplina> instantaDisciplinaList = new ArrayList<>();

}
