package degree.api.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "an_universitar")
public class AnUniversitar {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @Column(name = "an_universitar")
  private int anUniversitar;
  @Column(name = "tip_an_universitar")
  private String tipAnUniversitar;
  @OneToMany(mappedBy = "anUniversitar", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  private List<AnStudiu> anStudiuList = new ArrayList<>();

}
