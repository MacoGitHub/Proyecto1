package proyecto.repositories;

import org.springframework.stereotype.Repository;
import proyecto.models.Usuario;
import java.util.List;
import java.util.ArrayList;

@Repository
public class UsuarioRepository {
    private final List<Usuario> usuarios;
    public UsuarioRepository() {
        usuarios = new ArrayList<>();
    }
}
