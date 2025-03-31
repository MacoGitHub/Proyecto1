package proyecto.models;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue("PACIENTE")
public class Paciente extends Usuario {
    private String historialMedico;

    public Paciente() {}

    public Paciente(String userId, String fullName, String email, String phoneNumber, String password, String historialMedico) {
        super(userId, fullName, email, phoneNumber, password);
        this.historialMedico = historialMedico;
    }
    public void setHistorialMedico(String historialMedico) {
        this.historialMedico = historialMedico;
    }
    public String getHistorialMedico() {
        return historialMedico;
    }
}
