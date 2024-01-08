package dev.springexeat.service;

import dev.springexeat.models.UserModel;

public interface UserService {

    UserModel saveUser (UserDto userDto);
}
