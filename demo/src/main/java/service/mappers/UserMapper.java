package service.mappers;

import dao.entities.User;
import org.modelmapper.ModelMapper;
import service.dtos.UserDTO;

public class UserMapper {
    private ModelMapper modelMapper = new ModelMapper();

    public UserDTO fromEMployeeToEMployeeDto(User user){
        return  modelMapper.map(user, UserDTO.class );
    }

    public User fromEMployeeDtoToEMployee(UserDTO userDTO){
        return  modelMapper.map(userDTO, User.class );
    }
}
