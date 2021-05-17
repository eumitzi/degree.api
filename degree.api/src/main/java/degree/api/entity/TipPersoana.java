package degree.api.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tip_persoane")
public class TipPersoana {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @Column(name = "tip")
  private String tipPersoana;

  @OneToMany(mappedBy = "tipPersoana", cascade = CascadeType.ALL)
  private List<Persoana> persoane = new ArrayList<>();

  public TipPersoana() {}

  public TipPersoana(int id, String tipPersoana) {
    this.id = id;
    this.tipPersoana = tipPersoana;
  }

  @Override
  public String toString() {
    return "TipPersoane{" +
            "id=" + id +
            ", tipPersoana='" + tipPersoana + '\'' +
            '}';
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getTipPersoana() {
    return tipPersoana;
  }

  public void setTipPersoana(String tipPersoana) {
    this.tipPersoana = tipPersoana;
  }
}
