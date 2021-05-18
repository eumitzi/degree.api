package degree.api.entity;

import javax.persistence.*;

@Entity
@Table(name = "note_finale")
public class NoteFinale {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @Column(name = "data")
  private String data;

  @Column(name = "nota_examen")
  private float nota_examen;

  @Column(name = "nota_activitate")
  private float nota_activitate;

  @Column(name = "medie_finala")
  private float medie_finala;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "id", referencedColumnName = "id")
  private Student student;

  @ManyToOne
  private InstantaDisciplina instantaDisciplina;

  @ManyToOne
  private Note note;


}
