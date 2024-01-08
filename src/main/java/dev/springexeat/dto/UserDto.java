package dev.springexeat.dto;

import jakarta.persistence.Column;

public class UserDto {
    private String first_name;
    private String last_name;
    private String mat_no;
    private String email;
    private String role;
    private String password;

    public UserDto(String first_name, String last_name, String mat_no, String email, String role, String password) {
        super();
        this.first_name = first_name;
        this.last_name = last_name;
        this.mat_no = mat_no;
        this.email = email;
        this.role = role;
        this.password = password;
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
