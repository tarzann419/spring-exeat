package dev.springexeat.models;


import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String first_name;
    private String last_name;
    private String mat_no;
    @Column(name="email",unique=true,nullable = false)
    private String email;
    private String role;
    private String password;

    public UserModel() {
    }

    public UserModel(String first_name, String last_name, String mat_no, String email, String role, String password) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.mat_no = mat_no;
        this.email = email;
        this.role = role;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getMat_no() {
        return mat_no;
    }

    public void setMat_no(String mat_no) {
        this.mat_no = mat_no;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
