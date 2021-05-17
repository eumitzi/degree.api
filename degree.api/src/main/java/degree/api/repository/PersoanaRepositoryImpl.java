package degree.api.repository;

import degree.api.entity.Persoana;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class PersoanaRepositoryImpl implements PersoanaRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public Persoana save(Persoana persoana){
        entityManager.persist(persoana);
        return persoana;
    }
}
