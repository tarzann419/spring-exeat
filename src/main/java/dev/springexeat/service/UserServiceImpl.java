package dev.springexeat.service;

import dev.springexeat.dto.UserDto;
import dev.springexeat.models.UserModel;
import dev.springexeat.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;
    @Override
    public UserModel saveUser(UserDto userDto) {
        UserModel user = new UserModel(userDto.getFirst_name(), userDto.getLast_name(), userDto.getMat_no(), userDto.getRole(), userDto.getPassword(), userDto.getPassword());
        return userRepository.save(user);
    }
}
