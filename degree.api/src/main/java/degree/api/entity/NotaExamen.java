package degree.api.entity;

import javax.persistence.*;

@Entity
@Table(name = "note_examen")
public class NotaExamen {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "data")
  private String data;

  @Column(name = "nota")
  private float nota;

  @ManyToOne
  private Student student;

  @ManyToOne
  private Nota nota;

  @ManyToOne
  private InstantaDisciplina instantaDisciplina;
}
