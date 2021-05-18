package degree.api.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "note")
public class Note {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @Column(name = "tip_nota")
  private String tip_nota;

  @OneToMany(mappedBy = "note", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  private List<NoteActivitate> noteActivitateList = new ArrayList<>();

  @OneToMany(mappedBy = "note", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  private List<NoteExamen> noteExamenList = new ArrayList<>();

  @OneToMany(mappedBy = "note", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  private List<NoteFinale> noteFinaleList = new ArrayList<>();
}
