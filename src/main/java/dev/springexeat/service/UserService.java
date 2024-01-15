package dev.springexeat.service;

import dev.springexeat.dto.UserDto;
import dev.springexeat.models.StudentModel;
import dev.springexeat.models.UserModel;

public interface UserService {

    UserModel saveUser (UserDto userDto);

    UserModel getApplicationById(long id);

    StudentModel saveApplication(StudentModel student);

    StudentModel updateApplicationById(StudentModel student);
}
