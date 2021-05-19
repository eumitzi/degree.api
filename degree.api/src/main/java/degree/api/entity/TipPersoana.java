package degree.api.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tip_persoane")
public class TipPersoana {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "tip_persoana")
  private String tip;

  @JsonManagedReference
  @OneToMany(mappedBy = "tipPersoana", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  private List<Persoana> persoane = new ArrayList<>();

  public TipPersoana() {}

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public List<Persoana> getPersoane() {
    return persoane;
  }

  public void setPersoane(List<Persoana> persoane) {
    this.persoane = persoane;
  }

  public String getTip() {
    return tip;
  }

  public void setTip(String tipPersoana) {
    this.tip = tipPersoana;
  }
}
