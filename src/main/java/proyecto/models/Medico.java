package proyecto.models;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorValue("MEDICO")
public class Medico extends Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String especialidad;
    private Boolean estado;

    public Medico() {
    }
    public Medico(String fullName, String email, String phoneNumber, String password, String especialidad) {
        super(fullName, email, phoneNumber, password);
        this.especialidad = especialidad;
        this.estado = false;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
    public Boolean getEstado() {
        return estado;
    }
}
