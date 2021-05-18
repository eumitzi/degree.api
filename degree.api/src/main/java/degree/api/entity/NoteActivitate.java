package degree.api.entity;

import javax.persistence.*;

@Entity
@Table(name = "note_activitate")
public class NoteActivitate {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @Column(name = "data")
  private String data;

  @Column(name = "notaActivitate")
  private float notaActivitate;

  @ManyToOne
  private Student student;

  @ManyToOne
  private InstantaDisciplina instantaDisciplina;

  @ManyToOne
  private Note note;

}
