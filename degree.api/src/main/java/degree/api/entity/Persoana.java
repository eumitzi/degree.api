package degree.api.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table(name = "persoane")
public class Persoana {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "nume")
  private String nume;

  @Column(name = "prenume")
  private String prenume;

  @Column(name = "adresa")
  private String adresa;

  @JsonBackReference
  @ManyToOne
  private TipPersoana tipPersoana;

  public Persoana() {}

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getNume() {
    return nume;
  }

  public void setNume(String nume) {
    this.nume = nume;
  }

  public String getPrenume() {
    return prenume;
  }

  public void setPrenume(String prenume) {
    this.prenume = prenume;
  }

  public String getAdresa() {
    return adresa;
  }

  public void setAdresa(String adresa) {
    this.adresa = adresa;
  }

  public TipPersoana getTipPersoane() {
    return tipPersoana;
  }

  public void setTipPersoane(TipPersoana tipPersoana) {
    this.tipPersoana = tipPersoana;
  }

  @Override
  public String toString() {
    return "Persoane{"
        + "id_persoana="
        + id
        + ", nume='"
        + nume
        + '\''
        + ", prenume='"
        + prenume
        + '\''
        + ", adresa='"
        + adresa
        + '\''
        + ", tipPersoane="
        + tipPersoana
        + '}';
  }
}
