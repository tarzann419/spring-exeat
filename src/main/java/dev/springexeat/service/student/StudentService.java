package dev.springexeat.service.student;

import dev.springexeat.models.StudentModel;

import java.util.List;

public interface StudentService {
    StudentModel saveApplication(StudentModel studentModel);
    StudentModel getApplicationById(long id);
    List<StudentModel> findAllByMatNo(String matNo);
    StudentModel updateApplicationById(StudentModel studentModel);
    void deleteApplicationById(long id);
}
