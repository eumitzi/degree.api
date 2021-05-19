package degree.api.repository;

import degree.api.entity.NotaFinala;
import degree.api.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotaFinalaRepository extends JpaRepository<NotaFinala, Integer> {

}
