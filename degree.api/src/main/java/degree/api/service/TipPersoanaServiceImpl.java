package degree.api.service;

import degree.api.entity.Persoana;
import degree.api.entity.TipPersoana;
import degree.api.repository.PersoanaRepository;
import degree.api.repository.TipPersoanaRepository;
import jdk.dynalink.linker.LinkerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.w3c.dom.stylesheets.LinkStyle;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public class TipPersoanaServiceImpl implements TipPersoanaService {

    @Autowired
    private TipPersoanaRepository tipPersoanaRepository;
    @Autowired
    private PersoanaRepository persoanaRepository;

    @Override
    @Transactional
    public TipPersoana addTipPersoana(TipPersoana tipPersoana){
        tipPersoana =  tipPersoanaRepository.save(tipPersoana);
        Persoana persoana = new Persoana();
        persoana.setNume("test");
        persoana.setAdresa("adresa");
        persoana.setTipPersoane(tipPersoana);
       persoanaRepository.save(persoana);
        return tipPersoana;
    }
}
