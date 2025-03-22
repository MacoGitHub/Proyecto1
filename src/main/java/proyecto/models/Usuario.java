package proyecto.models;

public class Usuario {
    private String id;
    private String username;
    private String fullName;
    private String email;
    private String phoneNumber;
    private String password;
    private String homeAddress;
// ---------------------------------------------------------------------------------------------------------------------
    public Usuario() {this("", "", "", "", "" , "", ""); }
    public Usuario(String id, String username, String fullName, String email, String phoneNumber, String password, String homeAddress) {
        this.id = id;
        this.username = username;
        this.fullName = fullName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.homeAddress = homeAddress;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getUsername() {
        return username;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getFullName() {
        return fullName;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getPassword() {
        return password;
    }
    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }
    public String getHomeAddress() {
        return homeAddress;
    }
}
