package proyecto.controllers;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import proyecto.models.Login;
import proyecto.models.Paciente;
import proyecto.models.Medico;
import proyecto.models.Usuario;
import proyecto.repositories.LoginRepository;
import proyecto.repositories.MedicoRepository;
import proyecto.repositories.UsuarioRepository;
import proyecto.services.UsuarioService;

import java.util.Objects;

@Controller
public class loginController {
    private UsuarioService usuarioService;
    private final UsuarioRepository usuarioRepository;
    private final LoginRepository loginRepository;
private final MedicoRepository medicoRepository;

    public loginController(UsuarioRepository usuarioRepository, LoginRepository loginRepository, MedicoRepository medicoRepository) {
        this.usuarioRepository = usuarioRepository;
        this.loginRepository = loginRepository;
        this.medicoRepository = medicoRepository;
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/registrarMedico")
    public String registrarMedico(
        @RequestParam String fullName,
        @RequestParam String email,
        @RequestParam String phoneNumber,
        @RequestParam String especialidad,
        @RequestParam String password,
        @RequestParam String confirmPassword,
        Model model) {

            // Validar coincidencia de contraseñas
            if (!password.equals(confirmPassword)) {
                model.addAttribute("mensaje", "Las contraseñas no coinciden");
                return "registrarMedico";
            }

            // Verificar si la cédula ya existe
            if (medicoRepository.existsByfullName(fullName)) {
                model.addAttribute("mensaje", "Ya existe un médico con esta cédula");
                return "registrarMedico";
            }

            // Crear y guardar el médico
            Medico medico = new Medico(fullName, email, phoneNumber, password, especialidad);
            medicoRepository.save(medico);

            model.addAttribute("mensaje", "Médico registrado exitosamente");
            return "redirect:/registrarMedico"; // Redirige al formulario con mensaje de éxito
    }

    @GetMapping("/registrarUsuario")
    public String registrarUsuario(Model model) {
        model.addAttribute("mensaje", "Registrando Usuario");
        return "registrarUsuario";
    }

    @PostMapping("/login")
    public String procesarLogin(@RequestParam String userName, @RequestParam String password, HttpSession session, Model model) {
        Login login = loginRepository.findByUsernameAndPassword(userName, password);

        /*cif (usuario instanceof Medico) {
            return "redirect:/medicoGestion";
        } else if (usuario instanceof Paciente) {
            return "redirect:/pacienteHistorico";
        }*/

        if (login != null) {
            session.setAttribute("usuario", login);
            return "medicoGestion";
        } else {
            model.addAttribute("error", "Credenciales incorrectas");
            return "login";
        }
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/login";
    }
}
