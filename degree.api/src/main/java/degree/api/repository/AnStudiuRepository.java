package degree.api.repository;

import degree.api.entity.AnStudiu;
import degree.api.entity.TipPersoana;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnStudiuRepository extends JpaRepository<AnStudiu, Long> {

}
