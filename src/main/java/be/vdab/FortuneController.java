package be.vdab;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named  //Implicit name: fortuneController (klassenaam met eerste letter lowercase)
public class FortuneController {
    @Inject
    private FortuneRepository fortuneRepository;

    public String saySomethingCool() {
        List<Fortune> fortunes = fortuneRepository.findAll();
        return fortunes.get((int) (Math.random() * fortunes.size())).getMessage();
    }
}
