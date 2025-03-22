package proyecto.models;

public interface Usuario {
    String id = "";
    String username = "";
    String fullName = "";
    String email = "";
    String phoneNumber = "";
    String password = "";
    String homeAddress = "";
    // ---------------------------------------------------------------------------------------------------------------------
    default void setId(String id) {
    }
    default String getId() {
        return id;
    }
    default void setUsername(String username) {
    }
    default String getUsername() {
        return username;
    }
    default void setFullName(String fullName) {
    }
    default String getFullName() {
        return fullName;
    }
    default void setEmail(String email) {
    }
    default String getEmail() {
        return email;
    }
    default void setPhoneNumber(String phoneNumber) {
    }
    default String getPhoneNumber() {
        return phoneNumber;
    }
    default void setPassword(String password) {
    }
    default String getPassword() {
        return password;
    }
    default void setHomeAddress(String homeAddress) {
    }
    default String getHomeAddress() {
        return homeAddress;
    }
}
