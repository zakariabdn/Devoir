package dao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name="users")
public class User {
    private Long id_User;
    private String name;
    private String email;
    private LocalDate date_Naissance;
    private String password;

    public User() {

    }

    public User(Long id_User, String name, String email, LocalDate date_Naissance, String password) {
        this.id_User = id_User;
        this.name = name;
        this.email = email;
        this.date_Naissance = date_Naissance;
        this.password = password;
    }

    public Long getId_User() {
        return id_User;
    }

    public void setId_User(Long id_User) {
        this.id_User = id_User;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDate_Naissance() {
        return date_Naissance;
    }

    public void setDate_Naissance(LocalDate date_Naissance) {
        this.date_Naissance = date_Naissance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
