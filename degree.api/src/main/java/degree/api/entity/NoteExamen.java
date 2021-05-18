package degree.api.entity;

import javax.persistence.*;

@Entity
@Table(name = "note_examen")
public class NoteExamen {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @Column(name = "data")
  private String data;

  @Column(name = "nota")
  private float nota;

  @ManyToOne
  private Student student;

  @ManyToOne
  private Note note;

  @ManyToOne
  private InstantaDisciplina instantaDisciplina;
}
