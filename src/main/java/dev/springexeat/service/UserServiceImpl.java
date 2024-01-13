package dev.springexeat.service;

import dev.springexeat.dto.UserDto;
import dev.springexeat.models.UserModel;
import dev.springexeat.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserRepository userRepository;
//    for user registration
    @Override
    public UserModel saveUser(UserDto userDto) {
        UserModel user = new UserModel(
                userDto.getFirst_name(),
                userDto.getLast_name(),
                userDto.getMat_no(),
                userDto.getEmail(),
                userDto.getRole(),
                passwordEncoder.encode(userDto.getPassword()));
        return userRepository.save(user);
    }
}
