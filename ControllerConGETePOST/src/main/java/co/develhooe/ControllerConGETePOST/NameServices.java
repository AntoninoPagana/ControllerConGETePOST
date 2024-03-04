package co.develhooe.ControllerConGETePOST;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class NameServices {
    public String ritornaNome(@RequestParam String nomeDaRitornare){
        return nomeDaRitornare;
    }

    public StringBuilder ritornaNomeAlContrario(@RequestParam StringBuilder nomeDaRitornareContrario){
        return nomeDaRitornareContrario.reverse();
    }
}
