package degree.api.repository;

import degree.api.entity.CicluStudiu;
import degree.api.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CicluStudiuRepository extends JpaRepository<CicluStudiu, Integer> {
    @Override
    Optional<CicluStudiu> findById(Integer integer);
}
