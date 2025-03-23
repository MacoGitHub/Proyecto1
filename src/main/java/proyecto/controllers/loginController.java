package proyecto.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class loginController {
    @GetMapping("/login")
    public String login() {
        return "login";
    }


    @GetMapping("/registrarMedico")
    public String registrarMedico(Model model) {
        model.addAttribute("mensaje", "Registrando Medico");
        return "registrarMedico";
    }

    @GetMapping("/registrarUsuario")
    public String registrarUsuario(Model model) {
        model.addAttribute("mensaje", "Registrando Usuario");
        return "registrarUsuario";
    }
}
