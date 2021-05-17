package degree.api.entity;

import javax.persistence.*;

@Entity
@Table(name = "persoane")
public class Persoana {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @Column(name = "nume")
  private String nume;

  @Column(name = "prenume")
  private String prenume;

  @Column(name = "adresa")
  private String adresa;

  @ManyToOne
  private TipPersoana tipPersoana;

  public Persoana() {}

  public int getId() {
    return id;
  }

  public void setId(int id_persoana) {
    this.id = id_persoana;
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
