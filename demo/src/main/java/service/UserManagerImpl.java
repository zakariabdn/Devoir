package service;

import dao.entities.User;
import org.springframework.stereotype.Component;
import service.dtos.UserDTO;
import service.mappers.UserMapper;

@Component
public class UserManagerImpl implements UserManager {
    @Autowired
    private User userRepository;
    @Autowired
    private UserMapper userMapperr;

    @Override
    public UserDTO getEMployeeById(Long id) {
        return userMapperr.fromEMployeeToEMployeeDto(userRepository.findById(id).get());
    }





}
