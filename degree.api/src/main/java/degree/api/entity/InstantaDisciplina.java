package degree.api.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "instanta_disciplina")
public class InstantaDisciplina {
    @Id
    @GeneratedValue
    private Long id;



}
