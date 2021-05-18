package degree.api.repository;

import degree.api.entity.Persoana;
import degree.api.entity.TipPersoana;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipPersoanaRepository extends JpaRepository<TipPersoana, Persoana> {

}
