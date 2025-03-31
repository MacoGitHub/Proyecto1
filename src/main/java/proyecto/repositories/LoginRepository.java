package proyecto.repositories;

import org.springframework.stereotype.Repository;
import proyecto.models.Login;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface LoginRepository extends JpaRepository<Login, Long> {
    Login findByUsernameAndPassword(String username, String password);
}
