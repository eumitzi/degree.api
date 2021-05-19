package degree.api.entity;

import javax.persistence.*;

@Entity
@Table(name = "note_activitate")
public class NotaActivitate {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "data")
  private String data;

  @Column(name = "notaActivitate")
  private float notaActivitate;

  @ManyToOne
  private Student student;

  @ManyToOne
  private InstantaDisciplina instantaDisciplina;

  @ManyToOne
  private Nota nota;

}
