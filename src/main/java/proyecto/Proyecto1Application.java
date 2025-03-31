package proyecto;

/*Estudiantes: Malcom Chaves Obando - Kaleb Baruc
Grupo 04 - NRC: 41406
Profesor: Deivert Guiltrichs
Proyecto 1
Programación IV*/

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import proyecto.models.Login;
import proyecto.repositories.LoginRepository;

@SpringBootApplication
public class Proyecto1Application {

    public static void main(String[] args) {
        SpringApplication.run(Proyecto1Application.class, args);
    }
    @Bean
    CommandLineRunner init(LoginRepository repo) {
        return args -> {
            if (repo.findAll().isEmpty()) {
                Login admin = new Login();
                admin.setUsername("admin");
                admin.setPassword("1234");
                repo.save(admin);
            }
        };
    }
}
