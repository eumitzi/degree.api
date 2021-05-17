package degree.api.repository;

import degree.api.entity.TipPersoana;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class TipPersoanaRepositoryImpl implements TipPersoanaRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public TipPersoana save(TipPersoana tipPersoana){
        entityManager.persist(tipPersoana);
        return tipPersoana;
    }

}
