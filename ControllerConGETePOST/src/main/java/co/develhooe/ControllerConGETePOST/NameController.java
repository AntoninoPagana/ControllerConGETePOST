package co.develhooe.ControllerConGETePOST;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class NameController {
    @Autowired
    private NameServices nameServices;

    @GetMapping("ritornaNome")
    public String ritornaNome(@RequestParam String nome) {
        return nome;
    }

    @PostMapping("ritornaNomeAlContrario")
    public StringBuilder ritornaNomeAlContrario(@RequestParam StringBuilder nome) {
        return nameServices.ritornaNomeAlContrario(nome);
    }
}
