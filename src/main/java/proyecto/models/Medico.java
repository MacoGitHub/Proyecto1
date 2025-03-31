package proyecto.models;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue("MEDICO")
public class Medico extends Usuario {
    private String especialidad;

    public Medico() {
    }
    public Medico(String userId, String fullName, String email, String phoneNumber, String password, String especialidad) {
        super(userId, fullName, email, phoneNumber, password);
        this.especialidad = especialidad;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    public String getEspecialidad() {
        return especialidad;
    }
}
