package degree.api.repository;

import degree.api.entity.Persoana;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersoanaRepository extends JpaRepository<Persoana, Integer>{
}

