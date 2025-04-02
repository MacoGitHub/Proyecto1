package proyecto.controllers;

import proyecto.models.Login;
import proyecto.models.Medico;
import proyecto.models.Usuario;
import proyecto.repositories.UsuarioRepository;
import proyecto.repositories.MedicoRepository;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class administradorController {
private final MedicoRepository medicoRepository;

    public administradorController(MedicoRepository medicoRepository) {
        this.medicoRepository = medicoRepository;
    }

    @GetMapping("/administrador/admitir")
    public String administrador(HttpSession session, Model model ) {
       if (isAdminLoggedIn(session)){ return "redirect:/login"; }
        List<Medico> medicoList = medicoRepository.findMedicoByEstado(false);
        model.addAttribute("medicoList", medicoList);
        return "redirect:/administrador/admitir";
    }

    private boolean isAdminLoggedIn(HttpSession session) {
        Login login = (Login) session.getAttribute("administrador");
        return login != null && login.getAdmin();
    }



}
