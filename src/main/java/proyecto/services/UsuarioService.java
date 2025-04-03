package proyecto.services;

import org.springframework.stereotype.Service;
import proyecto.models.Usuario;
import proyecto.repositories.UsuarioRepository;

@Service
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

   /* public Usuario autenticarUsuario(String userId, String password) {
        return usuarioRepository.findByUserIdAndPassword(userId, password);
    }*/

}
