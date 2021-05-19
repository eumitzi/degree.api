package degree.api.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "studenti")
public class Student {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "nr_matricol")
  private String nrMatricol;

  @OneToOne(cascade = CascadeType.ALL)
  private Persoana persoana;

  @OneToMany(mappedBy = "student", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  private List<InstantaDisciplina> instantaDisciplinaList = new ArrayList<>();

  @OneToMany(mappedBy = "student", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  private List<NotaActivitate> notaActivitateList = new ArrayList<>();

  @OneToMany(mappedBy = "student", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  private List<NotaExamen> notaExamenList = new ArrayList<>();

}
