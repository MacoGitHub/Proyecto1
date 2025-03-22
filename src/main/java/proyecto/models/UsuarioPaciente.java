package proyecto.models;

public class UsuarioPaciente implements Usuario{
    private char sex;
// ---------------------------------------------------------------------------------------------------------------------
    public UsuarioPaciente() {

        this.sex = 'U'; // U para Unknown (desconocido)
    }
    public UsuarioPaciente(char sex, String id, String username, String fullName, String email, String phoneNumber, String password, String homeAddress) {

        this.sex = sex;
    }
    public void setSex(char sex) {
        this.sex = sex;
    }
    public char getSex() {
        return sex;
    }
}
