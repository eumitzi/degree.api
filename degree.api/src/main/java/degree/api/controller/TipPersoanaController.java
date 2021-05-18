package degree.api.controller;

import degree.api.entity.TipPersoana;
import degree.api.service.TipPersoanaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TipPersoanaController {

  @Autowired
  private TipPersoanaService tipPersoanaService;
  @GetMapping("/tipPers")
  public TipPersoana getTipPersoana(
      @RequestParam(value = "tipPersoana", defaultValue = "student") String tip) {
    TipPersoana tipPersoana = new TipPersoana();
    tipPersoana.setTipPersoana(tip);
    return tipPersoana;
  }

  @PostMapping("/tipPers")
  public TipPersoana postTipPers(TipPersoana tipPersoana){
    System.out.println("Tip pers: " + tipPersoana.getTipPersoana());
    tipPersoanaService.addTipPersoana(tipPersoana);
    return tipPersoana;
  }
}
