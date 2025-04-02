package proyecto.models;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorValue("PACIENTE")
public class Paciente extends Usuario {
    private String historialMedico;

    public Paciente() {}

    public Paciente(String fullName, String email, String phoneNumber, String password, String historialMedico) {
        super(fullName, email, phoneNumber, password);
        this.historialMedico = historialMedico;
    }
    public void setHistorialMedico(String historialMedico) {
        this.historialMedico = historialMedico;
    }
    public String getHistorialMedico() {
        return historialMedico;
    }
}
