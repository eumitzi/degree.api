package degree.api.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "instanta_disciplina")
public class InstantaDisciplina {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  @Column(name = "numar_credite")
  private int nrCredite;
  @Column(name = "semestru")
  private int semestru;
  @Column(name = "factor_k")
  private float factor_k;
  @OneToOne
  private AnUniversitar anUniversitar;
  @ManyToOne
  private Student student;
  @ManyToOne
  private DisciplinaGeneral disciplinaGeneral;
  @ManyToOne
  private AnStudiu anStudiu;

  @ManyToMany(
          cascade = {CascadeType.PERSIST, CascadeType.MERGE},
          fetch = FetchType.EAGER)
  @JoinTable(
          name = "profesor_instantaDisciplina",
          joinColumns = @JoinColumn(name = "id_instanta_disciplina", referencedColumnName = "id"),
          inverseJoinColumns = @JoinColumn(name = "id_profesor", referencedColumnName = "id"))
  private Set<Profesor> profesorSet = new HashSet<Profesor>();

  @OneToMany(mappedBy = "instantaDisciplina", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  private List<NoteActivitate> noteActivitateList = new ArrayList<>();

  @OneToMany(mappedBy = "instantaDisciplina", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  private List<NoteExamen> noteExamenList = new ArrayList<>();

  @OneToMany(mappedBy = "instantaDisciplina", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  private List<NoteFinale> noteFinaleList = new ArrayList<>();

}
