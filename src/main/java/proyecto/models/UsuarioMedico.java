package proyecto.models;

public class UsuarioMedico implements Usuario{
    private String speciality;
    private String workingArea;
    // ---------------------------------------------------------------------------------------------------------------------
    public UsuarioMedico() {
        this.speciality = "";
        this.workingArea = "";
    }
    public UsuarioMedico(String speciality, String workingArea, String id, String username, String fullName, String email, String phoneNumber, String password, String homeAddress) {
        this.speciality = speciality;
        this.workingArea = workingArea;
    }
    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
    public String getSpeciality() {
        return speciality;
    }
    public void setWorkingArea(String workingArea) {
        this.workingArea = workingArea;
    }
    public String getWorkingArea() {
        return workingArea;
    }
}
