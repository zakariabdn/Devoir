package web;

import dao.entities.User;
import graphql.kickstart.annotations.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import service.UserManager;
import service.dtos.UserDTO;
import service.mappers.UserMapper;

import java.time.LocalDate;
import java.util.List;
@Controller
public class UserGraphQLController {
    @Autowired
   private UserManager userManager;


    @QueryMapping
    public UserDTO getUserByEmail(@Argument String email){
        return UserManager.getUserByEmail(email);
    }
    public UserDTO getUserByDateNaissance(LocalDate date_Naissance){
        return UserManager.getUserByDateNaissance(date_Naissance);

    }
    public UserDTO saveUser(UserDTO userDTO){
        return UserManager.saveUser(UserDTO);

    }
    public UserDTO deleteUser(UserDTO userDTO){
        return UserManager.deleteUser(UserDTO);

    }




}
