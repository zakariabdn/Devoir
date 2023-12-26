package service.dtos;

import java.time.LocalDate;

public class UserDTO {
    private String name;
    private String email;
    private LocalDate date_Naissance;

    public UserDTO() {
    }

    public UserDTO(String name, String email, LocalDate date_Naissance) {
        this.name = name;
        this.email = email;
        this.date_Naissance = date_Naissance;
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
}
