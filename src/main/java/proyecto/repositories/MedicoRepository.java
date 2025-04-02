package proyecto.repositories;

import proyecto.models.Medico;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface MedicoRepository extends JpaRepository<Medico, Long> {
    List<Medico> findMedicoByEstado(boolean estado);
    Medico findByFullNameAndPassword(String fullName, String password);
    boolean existsByfullName(String fullName);
}
