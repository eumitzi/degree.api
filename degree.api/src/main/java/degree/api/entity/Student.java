package degree.api.entity;

import javax.persistence.*;

@Entity
@Table(name = "studenti")
public class Student {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @Column(name = "nr_matricol")
  private String nrMatricol;

  @OneToOne(cascade = CascadeType.ALL)
  private Persoana persoana;

  public Student() {}

  public Student(int id, String nrMatricol, Persoana persoana) {
    this.id = id;
    this.nrMatricol = nrMatricol;
    this.persoana = persoana;
  }

  public int getId() {
    return id;
  }

  public void setId(int id_student) {
    this.id = id_student;
  }

  public String getNrMatricol() {
    return nrMatricol;
  }

  public void setNrMatricol(String nr_matricol) {
    this.nrMatricol = nr_matricol;
  }

  @Override
  public String toString() {
    return "Student{"
        + "id_student="
        + id
        + ", nr_matricol='"
        + nrMatricol
        + '\''
        + ", persoana="
        + persoana
        + '}';
  }

  public Persoana getPersoana() {
    return persoana;
  }

  public void setPersoana(Persoana persoana) {
    this.persoana = persoana;
  }
}
