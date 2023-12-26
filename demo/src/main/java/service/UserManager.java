package service;

import service.dtos.UserDTO;

import java.time.LocalDate;

public interface UserManager {
    public UserDTO getUserByEmail(String email);
    public UserDTO getUserByDateNaissance(LocalDate date_Naissance);
    public UserDTO deleteUser (UserDTO userDTO);
    public UserDTO saveUser(UserDTO userDTO);
}
