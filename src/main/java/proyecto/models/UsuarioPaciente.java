package proyecto.models;

public class UsuarioPaciente extends Usuario{
    private char sex;
// ---------------------------------------------------------------------------------------------------------------------
    public UsuarioPaciente() {
        super();
        this.sex = 'U'; // U para Unknown (desconocido)
    }
    public UsuarioPaciente(char sex, String id, String username, String fullName, String email, String phoneNumber, String password, String homeAddress) {
        super(id, username, fullName, email, phoneNumber, password, homeAddress);
        this.sex = sex;
    }
    public void setSex(char sex) {
        this.sex = sex;
    }
    public char getSex() {
        return sex;
    }
}
