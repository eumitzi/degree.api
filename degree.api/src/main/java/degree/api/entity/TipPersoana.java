package degree.api.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tip_persoane")
public class TipPersoana {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY )
  private int id;

  @Column(name = "tip_persoana")
  private String tipPersoana;

  @JsonManagedReference
  @OneToMany(mappedBy = "tipPersoana", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  private List<Persoana> persoane = new ArrayList<>();

  public TipPersoana() {}

  public List<Persoana> getPersoane() {
    return persoane;
  }

  public void setPersoane(List<Persoana> persoane) {
    this.persoane = persoane;
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
