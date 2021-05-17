package degree.api.service;

import degree.api.entity.TipPersoana;
import degree.api.repository.TipPersoanaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class TipPersoanaServiceImpl implements TipPersoanaService {

    @Autowired
    private TipPersoanaRepository tipPersoanaRepository;

    @Override
    @Transactional
    public TipPersoana save(TipPersoana tipPersoana){
        return tipPersoanaRepository.save(tipPersoana);
    }
}
