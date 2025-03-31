package proyecto.controllers;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import proyecto.models.Medico;
import proyecto.models.Paciente;
import proyecto.models.Usuario;
import proyecto.services.UsuarioService;

@Controller
public class loginController {
    private UsuarioService usuarioService;

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

    @PostMapping
    public String procesarLogin(@RequestParam String userId, @RequestParam String password, Model model) {
        Usuario usuario = usuarioService.autenticarUsuario(userId, password);

        if (usuario == null) {
            model.addAttribute("error", "Credenciales incorrectas");
            return "login";
        }

        if (usuario instanceof Medico) {
            return "redirect:/medicoGestion";
        } else if (usuario instanceof Paciente) {
            return "redirect:/pacienteHistorico";
        }

        model.addAttribute("error", "Tipo de usuario desconocido");
        return "login";
    }
    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/login";
    }
}
