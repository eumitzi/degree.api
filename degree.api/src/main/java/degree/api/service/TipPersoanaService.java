package degree.api.service;

import degree.api.entity.Persoana;
import degree.api.entity.TipPersoana;
import degree.api.repository.PersoanaRepository;
import degree.api.repository.TipPersoanaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
@Service
public class TipPersoanaService{

    @Autowired
    private TipPersoanaRepository tipPersoanaRepository;
    @Autowired
    private PersoanaRepository persoanaRepository;

    @Transactional
    public TipPersoana addTipPersoana(TipPersoana tipPersoana){
        tipPersoana =  tipPersoanaRepository.save(tipPersoana);
//        Persoana persoana = new Persoana();
//        persoana.setNume("test");
//        persoana.setAdresa("adresa");
//        persoana.setTipPersoane(tipPersoana);
//       persoanaRepository.save(persoana);
        return tipPersoana;
    }
}
