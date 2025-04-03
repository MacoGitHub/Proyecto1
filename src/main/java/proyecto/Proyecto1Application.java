package proyecto;

/*Estudiantes:
    Malcom Chaves Obando
    Kaleb Baruc Rojas Gomez
Grupo 04 - NRC: 41406
Profesor: Deivert Guiltrichs
Proyecto 1
Programación IV*/

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import proyecto.models.Login;
import proyecto.models.Paciente;
import proyecto.models.Usuario;
import proyecto.repositories.LoginRepository;
import proyecto.repositories.MedicoRepository;
import proyecto.repositories.UsuarioRepository;

@SpringBootApplication
public class Proyecto1Application {

    public static void main(String[] args) {
        SpringApplication.run(Proyecto1Application.class, args);
    }
 /*   @Bean
    CommandLineRunner init(LoginRepository repo, UsuarioRepository repo2, MedicoRepository repo3) {
        return args -> {
            if (repo.findAll().isEmpty()) {
                Login admin = new Login();
                admin.setUsername("admin2");
                admin.setPassword("4321");
                repo.save(admin);
            }
            if(repo2.findAll().isEmpty()) {
                Paciente paciente = new Paciente();
                paciente.setHistorialMedico("Escoliosis");
                paciente.setPhoneNumber("84785899");
                paciente.setPassword("2301");
                paciente.setEmail("k@proyecto.com");
                paciente.setFullName("Kaleb");
                repo2.save(paciente);
            }
        };
    }*/
}
