package degree.api.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "note")
public class Nota {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "tip_nota")
  private String tip_nota;

  @OneToMany(mappedBy = "note", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  private List<NotaActivitate> notaActivitateList = new ArrayList<>();

  @OneToMany(mappedBy = "note", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  private List<NotaExamen> notaExamenList = new ArrayList<>();

  @OneToMany(mappedBy = "note", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  private List<NotaFinala> notaFinalaList = new ArrayList<>();
}
