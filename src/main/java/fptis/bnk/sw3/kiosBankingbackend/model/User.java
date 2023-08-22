package fptis.bnk.sw3.kiosBankingbackend.model;


import jakarta.persistence.*;


@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "username", nullable = false, unique = true)
    private String username;

    @Column(name = "password", nullable = false)
    private String password;

    private String firstName;

    private String lastName;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "role", nullable = false)
    private String role;

    @Column(name = "enable", nullable = false)
    private boolean enable;

    private String confirmationToken;
    private boolean isTempPassword;

    public Integer id() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String username() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String password() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String firstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String lastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String email() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String role() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public boolean enable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public String confirmationToken() {
        return confirmationToken;
    }

    public void setConfirmationToken(String confirmationToken) {
        this.confirmationToken = confirmationToken;
    }

    public User() {
        id = 0;
        username = "";
        password = "";
        firstName = "";
        lastName = "";
        email = "";
        role = "";
        enable = false;
        confirmationToken = "";
        setTempPassword(false);
    }


    public void setTempPassword(boolean isTempPassword) {
        this.isTempPassword = isTempPassword;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof User)) {
            return false;
        }

        User u = (User) o;

        return u.username().equals(this.username()) && u.email().equals(this.email())
                && u.role().equals(this.role()) && (u.enable() == this.enable());
    }

}
