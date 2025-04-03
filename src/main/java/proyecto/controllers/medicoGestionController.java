package proyecto.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class medicoGestionController {

    @GetMapping("/medicoGestion")
    public String medicoGestion() {
        return "medicoGestion";
    }

}
