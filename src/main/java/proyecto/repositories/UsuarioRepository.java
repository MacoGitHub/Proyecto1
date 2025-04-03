package proyecto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import proyecto.models.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
   // Usuario findByUserIdAndPassword(String userId, String password);
    Usuario findByUserNameAndPassword(String userName, String password);
}
