package degree.api.repository;

import degree.api.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DisciplinaGeneralRepository extends JpaRepository<Student, Integer> {

}
